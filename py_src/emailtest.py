import smtplib, ssl
sender_email= "joedevbirrer@gmail.com"
receiver_email = "joebirrer@student.ethz.ch"
f = open("C:/txt/haha.txt", "r")
message = f.read()


port = 465
password = "python##69"

context = ssl.create_default_context()

with smtplib.SMTP_SSL("smtp.gmail.com", port, context=context) as server:
    server.login("joeldevbirrer@gmail.com", password)
    server.sendmail(sender_email, receiver_email, message)

receiver_email = "jgschwind@student.ethz.ch"

with smtplib.SMTP_SSL("smtp.gmail.com", port, context=context) as server:
    server.login("joeldevbirrer@gmail.com", password)
    server.sendmail(sender_email, receiver_email, message)

receiver_email = "mdietsche@student.ethz.ch"

with smtplib.SMTP_SSL("smtp.gmail.com", port, context=context) as server:
    server.login("joeldevbirrer@gmail.com", password)
    server.sendmail(sender_email, receiver_email, message)

receiver_email = "abernhard@student.ethz.ch"

with smtplib.SMTP_SSL("smtp.gmail.com", port, context=context) as server:
    server.login("joeldevbirrer@gmail.com", password)
    server.sendmail(sender_email, receiver_email, message)

receiver_email = "ehaenni@student.ethz.ch"

with smtplib.SMTP_SSL("smtp.gmail.com", port, context=context) as server:
    server.login("joeldevbirrer@gmail.com", password)
    server.sendmail(sender_email, receiver_email, message)