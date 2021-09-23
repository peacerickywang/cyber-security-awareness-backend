/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50648
Source Host           : localhost:3306
Source Database       : cybersecurity

Target Server Type    : MYSQL
Target Server Version : 50648
File Encoding         : 65001

Date: 2021-09-14 15:10:51
*/
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `cybersecurity` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cybersecurity`;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MESSAGE_CONTENT` longtext,
  `CREATETIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `USER_ID` int(11) DEFAULT NULL,
  `POST_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for option
-- ----------------------------
DROP TABLE IF EXISTS `option`;
CREATE TABLE `option` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `KEY` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL,
  `QUESTION_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of option
-- ----------------------------
INSERT INTO `option` VALUES ('1', 'A', 'A document that sets the standards and processes your firm uses to secure your network and data', '21');
INSERT INTO `option` VALUES ('2', 'B', 'Details about the physical security of your organization\'s office space', '21');
INSERT INTO `option` VALUES ('3', 'C', 'Directions and information about how to keep secure during an emergency', '21');
INSERT INTO `option` VALUES ('4', 'D', 'I don\'t know', '21');
INSERT INTO `option` VALUES ('5', 'A', 'Boat123', '22');
INSERT INTO `option` VALUES ('6', 'B', 'WTh!5Z', '22');
INSERT INTO `option` VALUES ('7', 'C', 'into*48', '22');
INSERT INTO `option` VALUES ('8', 'D', '123456', '22');
INSERT INTO `option` VALUES ('9', 'A', 'Pay the cybercriminals to get back your data', '23');
INSERT INTO `option` VALUES ('10', 'B', 'Begin backup and recovery operations of your data', '23');
INSERT INTO `option` VALUES ('11', 'C', 'Open negotiations with the cybercriminals', '23');
INSERT INTO `option` VALUES ('12', 'D', 'Shut down your business', '23');
INSERT INTO `option` VALUES ('13', 'A', 'Stream music', '24');
INSERT INTO `option` VALUES ('14', 'B', 'Text friends', '24');
INSERT INTO `option` VALUES ('15', 'C', 'Browse social media', '24');
INSERT INTO `option` VALUES ('16', 'D', 'Online banking', '24');
INSERT INTO `option` VALUES ('17', 'A', 'Hack that website and deface it then post it on Facebook or Twitter.', '25');
INSERT INTO `option` VALUES ('18', 'B', 'Launch DDoS (Distributed Denial of Service) attacks into that website with the help of your friends if you can’t hack it in order to take it offline then post it in Facebook or      Twitter.', '25');
INSERT INTO `option` VALUES ('19', 'C', 'Do not login into that website and report it as a phishing page to Google Safe       Browsing Team – https://www.google.com/safebrowsing/report_phish/.', '25');
INSERT INTO `option` VALUES ('20', 'D', 'Just ignore that website and login to https://facebook.com instead.', '25');
INSERT INTO `option` VALUES ('21', 'A', 'Data science', '26');
INSERT INTO `option` VALUES ('22', 'B', 'Cyber security', '26');
INSERT INTO `option` VALUES ('23', 'C', 'Ethical hacking ', '26');
INSERT INTO `option` VALUES ('24', 'D', 'Database management', '26');
INSERT INTO `option` VALUES ('25', 'A', 'By tagging friends always ', '27');
INSERT INTO `option` VALUES ('26', 'B', 'By using security applications', '27');
INSERT INTO `option` VALUES ('27', 'C', 'Doing password protect', '27');
INSERT INTO `option` VALUES ('28', 'D', 'Going offline intermittently', '27');
INSERT INTO `option` VALUES ('29', 'A', 'Setting strong passwords', '28');
INSERT INTO `option` VALUES ('30', 'B', 'Using multiple accounts', '28');
INSERT INTO `option` VALUES ('31', 'C', 'Making all information private', '28');
INSERT INTO `option` VALUES ('32', 'D', 'Tagging friends less often', '28');
INSERT INTO `option` VALUES ('33', 'A', 'Bullying over the computer or mobile phones.', '29');
INSERT INTO `option` VALUES ('34', 'B', 'A game on the computer.', '29');
INSERT INTO `option` VALUES ('35', 'C', 'Bullying by cybermen.', '29');
INSERT INTO `option` VALUES ('36', 'D', 'When your computer turns off.', '29');
INSERT INTO `option` VALUES ('37', 'A', 'Emotional Bullying', '30');
INSERT INTO `option` VALUES ('38', 'B', 'Verbal Bullying.', '30');
INSERT INTO `option` VALUES ('39', 'C', 'Social Isolation.', '30');
INSERT INTO `option` VALUES ('40', 'D', 'Physical Bullying.', '30');
INSERT INTO `option` VALUES ('41', 'A', 'Skip school', '31');
INSERT INTO `option` VALUES ('42', 'B', 'Get bad grades', '31');
INSERT INTO `option` VALUES ('43', 'C', 'Have health problems', '31');
INSERT INTO `option` VALUES ('44', 'D', 'All of the above', '31');
INSERT INTO `option` VALUES ('45', 'A', 'Ignore or block the person', '32');
INSERT INTO `option` VALUES ('46', 'B', 'Tell your parents or a teacher', '32');
INSERT INTO `option` VALUES ('47', 'C', 'Get into a fight with the person at school', '32');
INSERT INTO `option` VALUES ('48', 'D', 'Save the messages as evidence', '32');
INSERT INTO `option` VALUES ('49', 'A', 'Gossip', '33');
INSERT INTO `option` VALUES ('50', 'B', 'Impersonation', '33');
INSERT INTO `option` VALUES ('51', 'C', 'Threats', '33');
INSERT INTO `option` VALUES ('52', 'D', 'None of the above', '33');
INSERT INTO `option` VALUES ('53', 'A', 'Drop in grades', '34');
INSERT INTO `option` VALUES ('54', 'B', 'Suicide', '34');
INSERT INTO `option` VALUES ('55', 'C', 'High self-esteem', '34');
INSERT INTO `option` VALUES ('56', 'D', 'Depression', '34');
INSERT INTO `option` VALUES ('57', 'A', 'Avoiding school', '35');
INSERT INTO `option` VALUES ('58', 'B', 'Sudden love for the outdoors', '35');
INSERT INTO `option` VALUES ('59', 'C', 'Becoming studious', '35');
INSERT INTO `option` VALUES ('60', 'D', 'Joining clubs and activities', '35');
INSERT INTO `option` VALUES ('61', 'A', 'A term used to describe an actor who is performing poorly', '36');
INSERT INTO `option` VALUES ('62', 'B', 'An attempt by a criminal to acquire sensitive information via text', '36');
INSERT INTO `option` VALUES ('63', 'C', 'The act of using the telephone or e-mail to scam an individual into surrendering sensitive information', '36');
INSERT INTO `option` VALUES ('64', 'D', 'I don\'t know', '36');
INSERT INTO `option` VALUES ('65', 'A', 'Sending someone an email that contains a malicious link that is disguised to look like an email from someone the person knows', '37');
INSERT INTO `option` VALUES ('66', 'B', 'Creating a fake website that looks nearly identical to a real website in order to trick users into entering their login information', '37');
INSERT INTO `option` VALUES ('67', 'C', 'AlI of the above', '37');
INSERT INTO `option` VALUES ('68', 'D', 'Not sure', '37');
INSERT INTO `option` VALUES ('69', 'A', 'Report the popup and the details to the website administrator', '38');
INSERT INTO `option` VALUES ('70', 'B', 'Ignore that popup', '38');
INSERT INTO `option` VALUES ('71', 'C', 'Click the popup and claim your prize.', '38');
INSERT INTO `option` VALUES ('72', 'D', 'Share the link to your friends, classmates and colleagues so that they could also claim the prize because sharing is caring.', '38');
INSERT INTO `option` VALUES ('73', 'A', 'Email filters that block suspicious attachments.', '39');
INSERT INTO `option` VALUES ('74', 'B', 'Cybersecurity awareness training.', '39');
INSERT INTO `option` VALUES ('75', 'C', 'Pop-up blockers.', '39');
INSERT INTO `option` VALUES ('76', 'D', 'I don\'t know', '39');
INSERT INTO `option` VALUES ('77', 'A', 'Registering with websites of unknown security using your mobile phone number at will.', '40');
INSERT INTO `option` VALUES ('78', 'B', 'After obtaining the delivery, tear off the personal information from the delivery box before discarding it.', '40');
INSERT INTO `option` VALUES ('79', 'C', 'None of the above', '40');
INSERT INTO `option` VALUES ('80', 'D', 'I don\'t know', '40');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `POST_TITLE` varchar(255) DEFAULT NULL,
  `POST_CONTENT` longtext,
  `CREATETIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `TOPIC_ID` int(11) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `ID` int(11) NOT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `TOPIC_ID` int(11) DEFAULT NULL,
  `TYPE` tinyint(4) DEFAULT NULL,
  `ANSWER` char(1) DEFAULT NULL,
  `EXPLAINATION` longtext,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('1', 'Even if a public Wi-Fi network requires a password, other users can potentially view the sensitive information a user sends across that Wi-Fi network.', '1', '0', '0', 'Public wireless networks are not secure, and they can give away your information.');
INSERT INTO `question` VALUES ('2', 'Turning off the GPS function of your smartphone prevents any tracking of your phone��s location.', '1', '0', '0', 'In addition to GPS, smartphones can also be tracked using the cellphone towers or Wi-Fi networks that the phone is connected to.');
INSERT INTO `question` VALUES ('3', 'Using your children\'s or pet\'s names is a good way to create a password.', '1', '0', '0', 'Strong passwords should be set to protect your accounts and information. Strong passwords contain numbers, uppercase letters, lowercase letters and symbols.');
INSERT INTO `question` VALUES ('4', 'Whenever possible you should allow your web browser to remember passwords so you don\'t have to write them down.', '1', '0', '0', 'Don\'t give your password to anyone, other people will get it through your browser.');
INSERT INTO `question` VALUES ('5', 'When you receive a link on Facebook from an unidentified and unsecured source, do not open it easily.', '1', '0', '1', 'Do not open unsafe links.');
INSERT INTO `question` VALUES ('6', 'When you are browsing Facebook and you find fraudulent information, you should report it to the administrator promptly.', '1', '0', '1', 'Fraudulent information on the internet should be reported promptly.');
INSERT INTO `question` VALUES ('7', '\"Abc123\" is a good password.', '1', '0', '0', 'Strong passwords should be set to protect your accounts and information. Strong passwords contain numbers, uppercase letters, lowercase letters and symbols.');
INSERT INTO `question` VALUES ('8', 'Cyberbullying can take place on computers, cell phones and tablets.', '2', '0', '1', 'Cyberbullying takes place through online channels, both on mobile phones and computers.');
INSERT INTO `question` VALUES ('9', 'Cyberbullying is not as bad as bullying in real life because you usually forget about it easily.', '2', '0', '0', 'Cyberbullying can also have a serious negative impact on the victim and can be very harmful.');
INSERT INTO `question` VALUES ('10', 'Technology like social media sites can only be used to hurt people.', '2', '0', '0', 'Modern technology has also brought convenience to people\'s lives and has many advantages.');
INSERT INTO `question` VALUES ('11', 'You should always tell an adult in a position of authority if you are being cyberbullied, even if it is the first time it has happened to you.', '2', '0', '1', 'Adults can provide you with more effective help when you experience cyberbullying.');
INSERT INTO `question` VALUES ('12', 'You can say anything you want online because no one knows who you really are.', '2', '0', '0', 'The online world has its own order, and crimes committed on the internet are also subject to liability.');
INSERT INTO `question` VALUES ('13', 'Cyberbullies sometimes bully because they are insecure or may have been bullied themselves.', '2', '0', '1', 'Victims of cyberbullying may also become perpetrators of cyberbullying.');
INSERT INTO `question` VALUES ('14', 'Responding to a bully by sending mean email can make the situation go from bad to worse and could cause it to become dangerous.', '2', '0', '1', 'The best way to deal with cyberbullying is to ignore them.');
INSERT INTO `question` VALUES ('15', 'The key to avoiding a phishing scam is to be aware.', '3', '0', '1', 'Staying alert can prevent you from being duped.');
INSERT INTO `question` VALUES ('16', 'You should never be suspicious of emails that ask for your personal information.', '3', '0', '0', 'Don\'t give out your personal information easily and always check the source of your emails carefully.');
INSERT INTO `question` VALUES ('17', '\"Your account has been accesed\" is a sentence that crooks will send you in an email to make you click on their link.', '3', '0', '1', 'This is a generic form of phishing email.');
INSERT INTO `question` VALUES ('18', 'Phishing scams come in the form of emails from banks and credit card companies.', '3', '0', '1', 'This is a generic form of phishing email.');
INSERT INTO `question` VALUES ('19', 'If you receive a phishing email you should click on their links and send your information.', '3', '0', '0', 'Don\'t give out your personal information easily and always check the source of your emails carefully.');
INSERT INTO `question` VALUES ('20', 'Phishing crooks can steal your identity and credit card information and use it to their advantage.', '3', '0', '1', 'Theft of bank cards and other information for profit is the main reason for phishing emails.');
INSERT INTO `question` VALUES ('21', 'What is an Information Security Policy?', '1', '1', 'A', 'Information Security Policy is a document that sets the standards and processes your firm uses to secure your network and data');
INSERT INTO `question` VALUES ('22', 'Which of the following four passwords is the most secure?', '1', '1', 'B', 'This password contains the basic elements of a strong password recommended by experts. It contains a combination of letters, numbers and symbols; it includes both upper and lower case letters; and it does not contain any words from the dictionary.');
INSERT INTO `question` VALUES ('23', 'If your network is hit with ransomware, what do you do?', '1', '1', 'B', 'Data backup is a good habit when it comes to helping us escape the grip of ransomware.');
INSERT INTO `question` VALUES ('24', 'What should you NOT do while using free Wi-Fi hotspots?', '1', '1', 'D', 'Public wireless networks are not secure, so do not bank at this time.');
INSERT INTO `question` VALUES ('25', 'You came across a website that looks exactly like Facebook but it has a different domain which you have never heard of, which of the following is the best course of action that should be taken?', '1', '1', 'C', 'Do not trust phishing sites easily and report such sites when you come across them.');
INSERT INTO `question` VALUES ('26', 'What technology field is concerned with social media privacy?', '1', '1', 'B', 'Cybersecurity is the discipline most relevant to social media privacy.');
INSERT INTO `question` VALUES ('27', 'How should you make your facebook account private and secure?', '1', '1', 'C', 'Passwords are the best way to protect your account.');
INSERT INTO `question` VALUES ('28', 'Which of these is a password protect measure?', '1', '1', 'A', 'Setting a stronger password is the best way to protect your account.');
INSERT INTO `question` VALUES ('29', 'What is cyber-bullying?', '2', '1', 'A', 'Cyberbullying is bullying by means of the internet, such as computers and mobile phones.');
INSERT INTO `question` VALUES ('30', 'What is it called when a bully hurts a victim?', '2', '1', 'D', 'Bullying that exposes the victim to physical harm is physical bullying.');
INSERT INTO `question` VALUES ('31', 'Kids who are cyberbullied are more likely to:', '2', '1', 'D', 'Bullying can have a negative physical and livelihood impact on the victim.');
INSERT INTO `question` VALUES ('32', 'Which of the following is NOT a good way to handle cyberbullying?', '2', '1', 'C', 'Fighting doesn\'t necessarily solve cyberbullying, but it can get you hurt.');
INSERT INTO `question` VALUES ('33', 'Miles got an email that Suzy was saying some mean things about him after school.  The email was from a screen name he did not recognize and it hurt his feelings.  What type of cyberbullying is happening to Miles?', '2', '1', 'A', 'The bully spreads negative comments by others about the victim that are not known to be true or false, a form of cyberbullying in the form of gossip.');
INSERT INTO `question` VALUES ('34', 'Which of the following is not an effect of cyberbullying?', '2', '1', 'C', 'Bullying can have a negative impact on the victim.');
INSERT INTO `question` VALUES ('35', 'Which of these is a sign of cyberbullying?', '2', '1', 'A', 'Bullying can have a negative impact on the victim.');
INSERT INTO `question` VALUES ('36', 'What is a vishing?', '3', '1', 'C', 'A vishng is an act of using the telephone or e-mail to scam an individual into surrendering sensitive information');
INSERT INTO `question` VALUES ('37', 'Which of the following is an example of a “phishing” attack?', '3', '1', 'C', 'Phishing attacks attempt to get a user to click on a malicious link or file by impersonating a trusted source the user is familiar with. All three of the choices listed are examples of a phishing attack.');
INSERT INTO `question` VALUES ('38', 'When you check your email inbox, you find that one of the emails says “You just won 100,000 US dollars! Click this link to claim your prize”, what should you do?', '3', '1', 'A', 'It is important to report phishing emails and, more importantly, to warn others so that they are not scammed.');
INSERT INTO `question` VALUES ('39', 'What is the best way to keep employees from falling for phishing scams?', '3', '1', 'B', 'Online safety training can help employees become more aware of security and avoid fraud.');
INSERT INTO `question` VALUES ('40', 'Which of the following actions protects personal information from being compromised?', '3', '1', 'B', 'Protecting personal information is an important way to avoid being exposed to phishing scams.');

-- ----------------------------
-- Table structure for quiz
-- ----------------------------
DROP TABLE IF EXISTS `quiz`;
CREATE TABLE `quiz` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `DURATION` varchar(255) DEFAULT NULL,
  `TOTAL_QUESTION` int(11) DEFAULT NULL,
  `TRUE_QUESTION` int(11) DEFAULT NULL,
  `CREATETIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `COMPLETETIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of quiz
-- ----------------------------

-- ----------------------------
-- Table structure for quiz_statistic
-- ----------------------------
DROP TABLE IF EXISTS `quiz_statistic`;
CREATE TABLE `quiz_statistic` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `QUIZ_ID` int(11) DEFAULT NULL,
  `TOPIC_ID` int(11) DEFAULT NULL,
  `TRUE_COUNT` int(11) DEFAULT NULL,
  `TOTAL_COUNT` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of quiz_statistic
-- ----------------------------

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topic
-- ----------------------------
INSERT INTO `topic` VALUES ('1', 'Protecting Social Media Data');
INSERT INTO `topic` VALUES ('2', 'Addressing Cyber Bullying');
INSERT INTO `topic` VALUES ('3', 'What to do about Phishing emails');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `SALT` varchar(255) DEFAULT NULL,
  `CREATETIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) DEFAULT NULL,
  `URL` varchar(255) DEFAULT NULL,
  `DURATION` varchar(255) DEFAULT NULL,
  `TOPIC_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of video
-- ----------------------------
INSERT INTO `video` VALUES ('1', 'Privacy and Social Media', 'The video gives an overview on how personal data is processed by social media. It is developed within the MAPPING project, which has received funding from the European Union’s Seventh Framework Programme for research, technological development and demonstration under grant agreement no 612345.', 'https://www.youtube.com/watch?v=sMLVkBxke20', '4:50:00', '1');
INSERT INTO `video` VALUES ('2', 'Addressing Cyber Bullying During a Pandemic', 'With many students attending school online, we encourage parents, caregivers, and educators to be on alert for behavior changes and other signs that a child is being bullied. Virtual learning is a whole new world and along with it can come risks such as cyber bullying. ', 'https://www.youtube.com/watch?v=7PmLfGSsBFE', '2:25:00', '2');
INSERT INTO `video` VALUES ('3', 'Email Phishing Scams? Prevent Common Threats by Using the S.T.O.P Method', 'Phishing scams are getting more and more sophisticated, and even the smartest people are getting duped (even a shark from Shark Tank!). By using the S.T.O.P Method', 'https://www.youtube.com/watch?v=yxlR1st8QKI', '7:26:00', '3');
INSERT INTO `video` VALUES ('4', 'What is phishing? Learn how this attack works', 'Phishing is a method of trying to gather personal information using deceptive e-mails and websites. Here\'s what you need to know about this increasingly sophisticated form of cyberattack.', 'https://www.youtube.com/watch?v=Y7zNlEMDmI4', '2:56:00', '3');
INSERT INTO `video` VALUES ('5', 'How to Beat Cyberbullies', 'We\'re going to teach you a four-step method for escaping the clutches of cyberbullies. ', 'https://www.youtube.com/watch?v=Jwu_7IqWh8Y', '5:07:00', '2');
INSERT INTO `video` VALUES ('6', 'Social Media Safety Tips', 'In 2019, there will be 2.77 billion social media users around the world. That’s 2.77 billion chances for cyber attacks to take place on social media. It’s easy to get caught up in the habit of oversharing on social media, but it can also be dangerous.', 'https://www.youtube.com/watch?v=vPlWDFtP0T0', '3:33:00', '1');
INSERT INTO `video` VALUES ('7', 'Privacy and Social Media (True case)', 'Experience from Griffith classmates', 'https://youtu.be/LBVfixZz8j8', '1:59:00', '1');
INSERT INTO `video` VALUES ('8', 'Addressing Cyber Bullying During a Pandemic (True case)', 'Experience from Griffith classmates', 'https://youtu.be/9M0RaaFqZgY', '1:41:00', '2');
INSERT INTO `video` VALUES ('9', 'Phishing emails (True case)', 'Experience from Griffith classmates', 'https://youtu.be/gmtOvS4dIHI', '2:02:00', '3');
