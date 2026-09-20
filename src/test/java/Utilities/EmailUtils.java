package Utilities;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.File;
import java.util.Properties;

public class EmailUtils {

    public static void sendTestReportEmail(String reportPath) {

        final String senderEmail = "marehe@gmail.com";
        final String appPassword = "oitcevmpeahohqrd";
        final String recipientEmail = "marehe11@gmail.com";

        Properties prop = new Properties();

        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.port", "587");

        Session session = Session.getInstance(prop, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                        senderEmail,
                        appPassword
                );
            }
        });

        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(senderEmail));

            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(recipientEmail)
            );

            message.setSubject("Automation Test Report");

            Multipart multipart = new MimeMultipart();

            // Email Body
            MimeBodyPart textPart = new MimeBodyPart();

            textPart.setText(
                    "Hello,\n\n" +
                            "Automation testing has been completed.\n\n" +
                            "Please find the test execution report attached.\n\n" +
                            "Regards,\n" +
                            "QA Automation Team"
            );

            multipart.addBodyPart(textPart);

            // Attachment
            File reportFile = new File(reportPath);

            if (!reportFile.exists()) {
                throw new RuntimeException(
                        "Report file not found: " + reportPath
                );
            }

            MimeBodyPart attachmentPart = new MimeBodyPart();

            attachmentPart.attachFile(reportFile);

            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Test report email sent successfully!");

        } catch (MessagingException e) {

            System.out.println("Failed to send email.");
            e.printStackTrace();

        } catch (Exception e) {

            System.out.println("Error while attaching report.");
            e.printStackTrace();
        }
    }
}