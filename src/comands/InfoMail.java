package comands;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class InfoMail
{ 
    public static void send(String to, String sub, 
            String msg, final String user,final String pass)
{ 
//create an instance of Properties Class   
Properties props = new Properties();

/*  Specifies the IP address of your default mail server
  for e.g if you are using gmail server as an email sever
you will pass smtp.gmail.com as value of mail.smtp host. 
As shown here in the code. 
Change accordingly, if your email id is not a gmail id
*/
props.put("mail.smtp.host", "smtp.gmail.com");
// below mentioned mail.smtp.port is optional 
props.put("mail.smtp.port", "587");		
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "true");

/* Pass Properties object(props) and Authenticator object   
for authentication to Session instance 
*/

Session session = Session.getInstance(props,new javax.mail.Authenticator()
{
protected PasswordAuthentication getPasswordAuthentication()
{
       return new PasswordAuthentication("chatbotmailsend@gmail.com","xandeletro10"); 
}
});

try {

  /*  Create an instance of MimeMessage, 
      it accept MIME types and headers 
  */

MimeMessage message = new MimeMessage(session);
message.setFrom(new InternetAddress(user));
message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
message.setSubject(sub);
message.setContent("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
		"<html style=\"width:100%;font-family:Arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\r\n" + 
		" <head> \r\n" + 
		"  <meta charset=\"UTF-8\"> \r\n" + 
		"  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> \r\n" + 
		"  <meta name=\"x-apple-disable-message-reformatting\"> \r\n" + 
		"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n" + 
		"  <meta content=\"telephone=no\" name=\"format-detection\"> \r\n" + 
		"  <title>Novo modelo de e-mail 2020-02-17</title> \r\n" + 
		"  <!--[if (mso 16)]>\r\n" + 
		"    <style type=\"text/css\">\r\n" + 
		"    a {text-decoration: none;}\r\n" + 
		"    </style>\r\n" + 
		"    <![endif]--> \r\n" + 
		"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \r\n" + 
		"  <!--[if !mso]><!-- --> \r\n" + 
		"  <link href=\"https://fonts.googleapis.com/css?family=Merriweather:400,400i,700,700i\" rel=\"stylesheet\"> \r\n" + 
		"  <!--<![endif]--> \r\n" + 
		"  <style type=\"text/css\">\r\n" + 
		"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:inline-block!important } a.es-button { font-size:20px!important; display:inline-block!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\r\n" + 
		"#outlook a {\r\n" + 
		"	padding:0;\r\n" + 
		"}\r\n" + 
		".ExternalClass {\r\n" + 
		"	width:100%;\r\n" + 
		"}\r\n" + 
		".ExternalClass,\r\n" + 
		".ExternalClass p,\r\n" + 
		".ExternalClass span,\r\n" + 
		".ExternalClass font,\r\n" + 
		".ExternalClass td,\r\n" + 
		".ExternalClass div {\r\n" + 
		"	line-height:100%;\r\n" + 
		"}\r\n" + 
		".es-button {\r\n" + 
		"	mso-style-priority:100!important;\r\n" + 
		"	text-decoration:none!important;\r\n" + 
		"}\r\n" + 
		"a[x-apple-data-detectors] {\r\n" + 
		"	color:inherit!important;\r\n" + 
		"	text-decoration:none!important;\r\n" + 
		"	font-size:inherit!important;\r\n" + 
		"	font-family:inherit!important;\r\n" + 
		"	font-weight:inherit!important;\r\n" + 
		"	line-height:inherit!important;\r\n" + 
		"}\r\n" + 
		".es-desk-hidden {\r\n" + 
		"	display:none;\r\n" + 
		"	float:left;\r\n" + 
		"	overflow:hidden;\r\n" + 
		"	width:0;\r\n" + 
		"	max-height:0;\r\n" + 
		"	line-height:0;\r\n" + 
		"	mso-hide:all;\r\n" + 
		"}\r\n" + 
		"</style> \r\n" + 
		" </head> \r\n" + 
		" <body style=\"width:100%;font-family:Arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> \r\n" + 
		"  <div class=\"es-wrapper-color\" style=\"background-color:#F6F6F6;\"> \r\n" + 
		"   <!--[if gte mso 9]>\r\n" + 
		"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\r\n" + 
		"				<v:fill type=\"tile\" color=\"#f6f6f6\"></v:fill>\r\n" + 
		"			</v:background>\r\n" + 
		"		<![endif]--> \r\n" + 
		"   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> \r\n" + 
		"     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"      <td valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-content\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
		"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td align=\"left\" style=\"Margin:0;padding-top:15px;padding-bottom:15px;padding-left:20px;padding-right:20px;\"> \r\n" + 
		"               <!--[if mso]><table width=\"560\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"270\" valign=\"top\"><![endif]--> \r\n" + 
		"               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"270\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-infoblock\" align=\"left\" style=\"padding:0;Margin:0;line-height:14px;font-size:12px;color:#CCCCCC;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:12px;font-family:Arial, sans-serif;line-height:14px;color:#CCCCCC;\">Put your preheader text here</p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td><td width=\"20\"></td><td width=\"270\" valign=\"top\"><![endif]--> \r\n" + 
		"               <table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"270\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-infoblock\" align=\"right\" style=\"padding:0;Margin:0;line-height:14px;font-size:12px;color:#CCCCCC;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:12px;font-family:Arial, sans-serif;line-height:14px;color:#CCCCCC;\"><a href=\"https://viewstripo.email\" target=\"_blank\" class=\"view\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\">View in browser</a></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td></tr></table><![endif]--></td> \r\n" + 
		"             </tr> \r\n" + 
		"           </table></td> \r\n" + 
		"         </tr> \r\n" + 
		"       </table> \r\n" + 
		"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-header\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
		"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"           <table class=\"es-header-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\"> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:5px;\"><a href=\"https://viewstripo.email\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#333333;\"><img src=\"https://evgouc.stripocdn.email/content/guids/CABINET_acccc08babb032a7b8ce0be0755c65a0/images/54951501250627327.png\" alt=\"Camellia logo\" title=\"Camellia logo\" width=\"189\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></a></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td style=\"padding:0;Margin:0;\"> \r\n" + 
		"                       <table class=\"es-menu\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                         <tr class=\"links\" style=\"border-collapse:collapse;\"> \r\n" + 
		"                          <td style=\"Margin:0;padding-left:5px;padding-right:5px;padding-top:15px;padding-bottom:11px;border:0;\" width=\"25.00%\" bgcolor=\"transparent\" align=\"center\"><a style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:16px;text-decoration:none;display:block;color:#333333;\" href=\"https://viewstripo.email\"> Makeup</a></td> \r\n" + 
		"                          <td style=\"Margin:0;padding-left:5px;padding-right:5px;padding-top:15px;padding-bottom:11px;border:0;\" width=\"25.00%\" bgcolor=\"transparent\" align=\"center\"><a style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:16px;text-decoration:none;display:block;color:#333333;\" href=\"https://viewstripo.email\">Fragrance</a></td> \r\n" + 
		"                          <td style=\"Margin:0;padding-left:5px;padding-right:5px;padding-top:15px;padding-bottom:11px;border:0;\" width=\"25.00%\" bgcolor=\"transparent\" align=\"center\"><a style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:16px;text-decoration:none;display:block;color:#333333;\" href=\"https://viewstripo.email\">Solutions</a></td> \r\n" + 
		"                          <td style=\"Margin:0;padding-left:5px;padding-right:5px;padding-top:15px;padding-bottom:11px;border:0;\" width=\"25.00%\" bgcolor=\"transparent\" align=\"center\"><a style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:16px;text-decoration:none;display:block;color:#333333;\" href=\"https://viewstripo.email\">Sale</a></td> \r\n" + 
		"                         </tr> \r\n" + 
		"                       </table></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table></td> \r\n" + 
		"             </tr> \r\n" + 
		"           </table></td> \r\n" + 
		"         </tr> \r\n" + 
		"       </table> \r\n" + 
		"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
		"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#014201;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#014201\" align=\"center\"> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td class=\"esdev-adapt-off\" style=\"padding:0;Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;background-image:url(https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/57711551178774488.jpg);background-color:#014201;background-position:center center;background-repeat:no-repeat;\" bgcolor=\"#014201\" align=\"left\" background=\"https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/57711551178774488.jpg\"> \r\n" + 
		"               <table class=\"esdev-mso-table\" width=\"560\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td class=\"esdev-mso-td\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-m-p0r\" width=\"214\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                       <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                          <td align=\"center\" style=\"padding:0;Margin:0;padding-left:20px;padding-right:20px;padding-top:40px;\"> \r\n" + 
		"                           <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                              <td style=\"padding:0;Margin:0px;border-bottom:2px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
		"                             </tr> \r\n" + 
		"                           </table></td> \r\n" + 
		"                         </tr> \r\n" + 
		"                       </table></td> \r\n" + 
		"                      <td width=\"20\" style=\"padding:0;Margin:0;\"></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                  <td class=\"esdev-mso-td\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td width=\"92\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                       <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-position:center center;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
		"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                          <td align=\"center\" style=\"padding:0;Margin:0;\"><img src=\"https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/75281551177698033.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"42\"></td> \r\n" + 
		"                         </tr> \r\n" + 
		"                       </table></td> \r\n" + 
		"                      <td width=\"20\" style=\"padding:0;Margin:0;\"></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                  <td class=\"esdev-mso-td\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td width=\"214\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                       <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                          <td align=\"center\" style=\"padding:0;Margin:0;padding-left:20px;padding-right:20px;padding-top:40px;\"> \r\n" + 
		"                           <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                              <td style=\"padding:0;Margin:0px;border-bottom:2px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
		"                             </tr> \r\n" + 
		"                           </table></td> \r\n" + 
		"                         </tr> \r\n" + 
		"                       </table></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table></td> \r\n" + 
		"             </tr> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td style=\"padding:0;Margin:0;padding-bottom:40px;padding-left:40px;padding-right:40px;background-image:url(https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/57711551178774488.jpg);background-color:#014201;background-position:center top;background-repeat:no-repeat;\" bgcolor=\"#014201\" align=\"left\" background=\"https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/57711551178774488.jpg\"> \r\n" + 
		"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"520\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;border-left:2px solid #FFFFFF;border-right:2px solid #FFFFFF;border-bottom:2px solid #FFFFFF;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"center\" style=\"Margin:0;padding-bottom:5px;padding-left:20px;padding-right:20px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:48px;mso-line-height-rule:exactly;font-family:merriweather, georgia, 'times new roman', serif;font-size:40px;font-style:normal;font-weight:normal;color:#379E4F;\">You’re In Luck!</h1></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td bgcolor=\"transparent\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-left:20px;padding-right:20px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:merriweather, georgia, 'times new roman', serif;font-size:20px;font-style:normal;font-weight:normal;color:#EFEFEF;\">Get 25% discount for herbal cosmetics!</h3></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:15px;padding-left:20px;padding-right:20px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#EFEFEF;\">Don't miss a chance to buy a present for your friends or&nbsp;relatives because body care products are the best gifts.</p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-left:10px;padding-right:10px;padding-bottom:40px;\"><span class=\"es-button-border\" style=\"border-style:solid;border-color:transparent;background:#379E4F;border-width:0px;display:inline-block;border-radius:0px;width:auto;\"><a href=\"https://viewstripo.email\" class=\"es-button\" target=\"_blank\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'lucida sans unicode', 'lucida grande', sans-serif;font-size:16px;color:#FFFFFF;border-style:solid;border-color:#379E4F;border-width:10px 30px 10px 30px;display:inline-block;background:#379E4F;border-radius:0px;font-weight:normal;font-style:normal;line-height:19px;width:auto;text-align:center;\">Shop Now</a></span></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table></td> \r\n" + 
		"             </tr> \r\n" + 
		"           </table></td> \r\n" + 
		"         </tr> \r\n" + 
		"       </table> \r\n" + 
		"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
		"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\"> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td style=\"padding:0;Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;background-position:center top;\" align=\"left\"> \r\n" + 
		"               <!--[if mso]><table width=\"560\" cellpadding=\"0\" \r\n" + 
		"                        cellspacing=\"0\"><tr><td width=\"270\" valign=\"top\"><![endif]--> \r\n" + 
		"               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td class=\"es-m-p20b\" width=\"270\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-position:center top;background-color:transparent;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"transparent\" role=\"presentation\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"right\" style=\"padding:0;Margin:0;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#379E4F;\"><img class=\"adapt-img\" src=\"https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/80951551191144672.jpg\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"270\"></a></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td><td width=\"20\"></td><td width=\"270\" valign=\"top\"><![endif]--> \r\n" + 
		"               <table class=\"es-right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right;background-position:left top;\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"270\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:5px;padding-bottom:10px;\"><h3 class=\"product-name\" style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:merriweather, georgia, 'times new roman', serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333;\">Moisturizer and anti-wrinkle treatments</h3></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-m-txt-c\" align=\"left\" style=\"padding:0;Margin:0;\"><p class=\"product-description\" style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#333333;\">Natural &amp; Organic moisturizer and anti-wrinkle treatments.</p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-top:10px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:merriweather, georgia, 'times new roman', serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333;\"><span class=\"price\">$45.00</span>&nbsp; <span style=\"font-size:18px;color:#808080;\"><s class=\"old-price\" style=\"text-decoration:line-through;\">$60.00</s></span></h3></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-m-txt-c\" align=\"left\" style=\"padding:0;Margin:0;padding-top:15px;\"><span class=\"es-button-border\" style=\"border-style:solid;border-color:transparent;background:#379E4F;border-width:0px;display:inline-block;border-radius:0px;width:auto;\"><a href=\"https://viewstripo.email\" class=\"es-button\" target=\"_blank\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'lucida sans unicode', 'lucida grande', sans-serif;font-size:16px;color:#FFFFFF;border-style:solid;border-color:#379E4F;border-width:10px 30px 10px 30px;display:inline-block;background:#379E4F;border-radius:0px;font-weight:normal;font-style:normal;line-height:19px;width:auto;text-align:center;\">Shop Now</a></span></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td></tr></table><![endif]--></td> \r\n" + 
		"             </tr> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td style=\"Margin:0;padding-top:20px;padding-left:20px;padding-right:20px;padding-bottom:30px;background-position:center top;\" align=\"left\"> \r\n" + 
		"               <!--[if mso]><table width=\"560\" cellpadding=\"0\" \r\n" + 
		"                        cellspacing=\"0\"><tr><td width=\"270\" valign=\"top\"><![endif]--> \r\n" + 
		"               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td class=\"es-m-p20b\" width=\"270\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-position:center top;background-color:transparent;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"transparent\" role=\"presentation\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"right\" style=\"padding:0;Margin:0;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#379E4F;\"><img class=\"adapt-img\" src=\"https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/88241551191250029.jpg\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"270\"></a></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td><td width=\"20\"></td><td width=\"270\" valign=\"top\"><![endif]--> \r\n" + 
		"               <table class=\"es-right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right;background-position:left top;\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"270\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:5px;padding-bottom:15px;\"><h3 class=\"product-name\" style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:merriweather, georgia, 'times new roman', serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333;\">Perfume Lilac Beauty</h3></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-m-txt-c\" align=\"left\" style=\"padding:0;Margin:0;\"><p class=\"product-description\" style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#333333;\">Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-top:10px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:merriweather, georgia, 'times new roman', serif;font-size:20px;font-style:normal;font-weight:normal;color:#333333;\"><span class=\"price\">$33.00</span>&nbsp; <span style=\"font-size:18px;color:#808080;\"><s class=\"old-price\" style=\"text-decoration:line-through;\">$55.00</s></span><br></h3></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-m-txt-c\" align=\"left\" style=\"padding:0;Margin:0;padding-top:15px;\"><span class=\"es-button-border\" style=\"border-style:solid;border-color:transparent;background:#379E4F;border-width:0px;display:inline-block;border-radius:0px;width:auto;\"><a href=\"https://viewstripo.email\" class=\"es-button\" target=\"_blank\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'lucida sans unicode', 'lucida grande', sans-serif;font-size:16px;color:#FFFFFF;border-style:solid;border-color:#379E4F;border-width:10px 30px 10px 30px;display:inline-block;background:#379E4F;border-radius:0px;font-weight:normal;font-style:normal;line-height:19px;width:auto;text-align:center;\">Shop Now</a></span></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td></tr></table><![endif]--></td> \r\n" + 
		"             </tr> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td style=\"padding:0;Margin:0;padding-bottom:20px;background-color:transparent;background-position:center top;\" bgcolor=\"transparent\" align=\"left\"> \r\n" + 
		"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-position:center top;background-color:transparent;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"transparent\" role=\"presentation\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"center\" style=\"padding:0;Margin:0;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#379E4F;\"><img class=\"adapt-img\" src=\"https://evgouc.stripocdn.email/content/guids/CABINET_408c1ef3a227848a590dfdb3e09a9b67/images/8871551192297920.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"600\"></a></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"Margin:0;padding-bottom:10px;padding-top:15px;padding-left:20px;padding-right:20px;\"><h2 class=\"product-name\" style=\"Margin:0;line-height:29px;mso-line-height-rule:exactly;font-family:merriweather, georgia, 'times new roman', serif;font-size:24px;font-style:normal;font-weight:normal;color:#333333;\">What Are Herbal Cosmetics?</h2></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-m-txt-c\" bgcolor=\"transparent\" align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-left:20px;padding-right:20px;\"><p class=\"product-description\" style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#333333;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.</p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-m-txt-c\" bgcolor=\"transparent\" align=\"left\" style=\"padding:0;Margin:0;padding-left:20px;padding-right:20px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:'lucida sans unicode', 'lucida grande', sans-serif;line-height:21px;color:#333333;\"><a target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:'lucida sans unicode', 'lucida grande', sans-serif;font-size:14px;text-decoration:none;color:#379E4F;\" href=\"https://viewstripo.email\">Read more</a></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table></td> \r\n" + 
		"             </tr> \r\n" + 
		"           </table></td> \r\n" + 
		"         </tr> \r\n" + 
		"       </table> \r\n" + 
		"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
		"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"           <table class=\"es-footer-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#333333;\"> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px;\"> \r\n" + 
		"               <!--[if mso]><table width=\"560\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"194\"><![endif]--> \r\n" + 
		"               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td class=\"es-m-p0r es-m-p20b\" width=\"174\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#FFFFFF;\"><span style=\"font-family:'lucida sans unicode', 'lucida grande', sans-serif;\"><strong style=\"line-height:150%;\">Menu</strong></span></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#FFFFFF;\"><a target=\"_blank\" href=\"\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\"></a><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">Makeup</a></p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">Fragrance</a></p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">Solutions</a></p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">Sale</a></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                  <td class=\"es-hidden\" width=\"20\" style=\"padding:0;Margin:0;\"></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td><td width=\"173\"><![endif]--> \r\n" + 
		"               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td class=\"es-m-p20b\" width=\"173\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#FFFFFF;\"><span style=\"font-family:'lucida sans unicode', 'lucida grande', sans-serif;\"><strong style=\"line-height:150%;\">Services</strong></span><br></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">Privacy Policy</a></p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">Terms & Conditions</a></p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">Payment</a></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td><td width=\"20\"></td><td width=\"173\"><![endif]--> \r\n" + 
		"               <table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"173\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#FFFFFF;\"><span style=\"font-family:'lucida sans unicode', 'lucida grande', sans-serif;\"><strong style=\"line-height:150%;\">Get in Touch</strong></span><br></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"tel:123456789\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">123456789</a></p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:Arial, sans-serif;line-height:21px;color:#8C8788;\"><a target=\"_blank\" href=\"mailto:contact@shop.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:underline;color:#8C8788;\">your@mail.com</a></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:15px;\"> \r\n" + 
		"                       <table class=\"es-table-not-adapt es-social\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px;\"><img title=\"Twitter\" src=\"https://stripo.email/cabinet/assets/editor/assets/img/social-icons/circle-black/twitter-circle-black.png\" alt=\"Tw\" width=\"24\" height=\"24\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></td> \r\n" + 
		"                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px;\"><img title=\"Facebook\" src=\"https://stripo.email/cabinet/assets/editor/assets/img/social-icons/circle-black/facebook-circle-black.png\" alt=\"Fb\" width=\"24\" height=\"24\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></td> \r\n" + 
		"                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px;\"><img title=\"Youtube\" src=\"https://stripo.email/cabinet/assets/editor/assets/img/social-icons/circle-black/youtube-circle-black.png\" alt=\"Yt\" width=\"24\" height=\"24\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></td> \r\n" + 
		"                          <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"><img title=\"Vkontakte\" src=\"https://stripo.email/cabinet/assets/editor/assets/img/social-icons/circle-black/vk-circle-black.png\" alt=\"Vk\" width=\"24\" height=\"24\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></td> \r\n" + 
		"                         </tr> \r\n" + 
		"                       </table></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table> \r\n" + 
		"               <!--[if mso]></td></tr></table><![endif]--></td> \r\n" + 
		"             </tr> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:20px;padding-left:20px;padding-right:20px;\"> \r\n" + 
		"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"560\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:20px;\"> \r\n" + 
		"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #BC846F;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
		"                         </tr> \r\n" + 
		"                       </table></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:12px;font-family:arial, helvetica, sans-serif;line-height:18px;color:#8C8788;\">You are receiving this email because you have visited our site or asked us about regular newsletter.</p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:12px;font-family:Arial, sans-serif;line-height:18px;color:#8C8788;\"><a target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:12px;text-decoration:underline;color:#8C8788;line-height:18px;\" class=\"unsubscribe\" href=\"\">Unsubscribe</a>&nbsp; | <a target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:12px;text-decoration:underline;color:#8C8788;line-height:18px;\" href=\"https://viewstripo.email\">Update Preferences</a> | <a target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:12px;text-decoration:underline;color:#8C8788;line-height:18px;\" href=\"https://viewstripo.email\">Customer Support</a></p></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table></td> \r\n" + 
		"             </tr> \r\n" + 
		"           </table></td> \r\n" + 
		"         </tr> \r\n" + 
		"       </table> \r\n" + 
		"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
		"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
		"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"              <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> \r\n" + 
		"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                  <td width=\"560\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
		"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
		"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
		"                      <td class=\"es-infoblock made_with\" align=\"center\" style=\"padding:0;Margin:0;line-height:14px;font-size:12px;color:#CCCCCC;\"><a target=\"_blank\" href=\"https://viewstripo.email/?utm_source=templates&utm_medium=email&utm_campaign=cosmetics&utm_content=St_patricks_day\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img src=\"https://evgouc.stripocdn.email/content/guids/cab_pub_7cbbc409ec990f19c78c75bd1e06f215/images/78411525331495932.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"125\"></a></td> \r\n" + 
		"                     </tr> \r\n" + 
		"                   </table></td> \r\n" + 
		"                 </tr> \r\n" + 
		"               </table></td> \r\n" + 
		"             </tr> \r\n" + 
		"           </table></td> \r\n" + 
		"         </tr> \r\n" + 
		"       </table></td> \r\n" + 
		"     </tr> \r\n" + 
		"   </table> \r\n" + 
		"  </div>  \r\n" + 
		" </body>\r\n" + 
		"</html>", "text/html");

/* Transport class is used to deliver the message to the recipients */

Transport.send(message);
}

catch(Exception e) {
e.printStackTrace();
}
}  
}