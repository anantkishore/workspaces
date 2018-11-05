var nodemailer = require('nodemailer');

var transporter = nodemailer.createTransport(
    {
        service: 'hotmail',
        auth: {
            user: 'kishoreanant@hotmail.com',
            pass: '***********'
        }
    }
);

var mailoptions = {
    from: 'anantkishore007@gmail.com',
    to: 'kishoreanant@hotmail.com',
    subject: 'Sending email using node.js',
    text: 'Hello Anant!'
};

transporter.sendMail(mailoptions, function(err, info) {
    if(err) 
    {
        console.log(err);
    }
    else
    {
        console.log('Mail sent successfully.', info.response);
    }
});