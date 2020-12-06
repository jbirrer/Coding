import smtplib, ssl
sender_email= "joedevbirrer@gmail.com"
receiver_email = "demaio.anissa@gmail.com"
m = "Ich liebe dich "
for i in range (10):
    m = m + m + "Anissa"
message = m

port = 465
password = "Joel7Zoe1%"

context = ssl.create_default_context()

with smtplib.SMTP_SSL("smtp.gmail.com", port, context=context) as server:
    server.login("joeldevbirrer@gmail.com", password)
    server.sendmail(sender_email, receiver_email, message)