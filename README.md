<p align="center">
<img width="300" height="300" src="https://media.licdn.com/dms/image/C560BAQEFJPl7DXD1Dg/company-logo_200_200/0?e=2159024400&v=beta&t=4wzyvb7GBsvMovoet_LGS9uj_Gso_kmfWqCXnqydCDI">

</p>

<p align="center">
Project Name: Family Tracker. </br> </br>
Course Number: CSE 299 </br>
Group: 03 </br>
Section: 01 </br>
Semester: Summer2019 </br>
Faculty Name: Shaikh Shawon Arefin Shimon </br> </br>
Submitted by: </br> </br>
Name:A. K. M. Mahbub Ullah </br>
ID:1520383042</br>
Email:mahbub.ullah@northsouth.edu</br> </br>
Name:Sadaaf Chowdhury	</br>
ID:1631415642	</br>
Email:sadaaf.chowdhury@northsouth.ed</br> </br>
Git link: https://github.com/SadaafChowdhury/SU19CSE299S02G03NSU</br> </br>
Date: 15 June 2019</br>
</p>

## Idea: 

We want to make an android app which will help a parent see the location of their children using Google Maps. There will be two versions of the app, one for the parent and the other for the child. In the child app there will be an option of inserting a unique code of the parent so that the app knows whose children they are and show locations accordingly.


## Problem: 

We are trying to solve a problem of parents worrying where their children are when they aren’t picking up a call, when someone is kidnapped and can also be used if the phone is stolen or lost.


## Solution: 

Our application will show the location of the person at any given moment as long as the location system is on, thus, giving access to parents to know where their children are.


## Features: 

### 1.	Real Time Tracking:

Most GPS Tracking devices are enabled with real-time monitoring. Location of the vehicles is tracked on the map as it moves from point to point. The GPS location of your vehicle is displayed on a map. The current state of child, like moving or idle is shown using map markers.


### 2.	Registration: 

The user will have to register first. There will be two kinds of registration. One is parent and another is the child. The parent can see the location of their child’s phone. The child type can also track their parent’s phone. 


###  3.	History:

User can track all the places went by the child graphically on the map.


## Technology:

Androids studio will be used for making the application. Github will be used for uploading the parts of the application in one folder. Slack will be used for group discussion. And piazza will be used for class discussion.

 
## Monetization: 

We will have a monthly subscription for the parent who will track their child. If they want to track more than one child, they have to pay extra in the monthly subscription per child they want to add. 

There will be in app advertisements such as ad banners which will constantly be there at the bottom of the screen. There will be video ads which they can see to earn points and then redeem the points to pay for the subscription of increasing the number of children. The number of videos will be set in such a way that the total revenue from the videos will be a bit higher than what they would have paid for the subscription.

Payment methods will be Credit Card system where they will add they will credit card number and every month from the day they start, a notification will come whether they want to pay for another month or not.

The customer will also be able to pay with Bkash and Ucash since these are very common in Bangladesh.




Contents

1 Backgrounds						 				4
1.1 Goals . . . . . . . . . . . . . . . . . . . . . . . . 4
1.2 State of the art . . . . . . . . . . . . . . . . . . . . . . . . . . . . 5
1.3 Use Cases . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 5

2 Functional Description 									6
2.1 Requirements . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 6

3 Operational Instructions 									9
3.1 System Requirements . . . . . . . . . . . . . . . . . . . . . . . . 9
3.2 Software . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 9
3.3 Hardware . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 9
3.4 Architecture . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 10
3.4.1 Components . . . . . . . . . . . . . . . . . . . . . . . . . 10
3.4.2 Software Modules . . . . . . . . . . . . . . . . . . . . . . . 10
3.4.3 EJB container: description of Entity Bean and the Session 11
3.4.4 WEB container: description of the JSPs and Servlets . . . 11
3.4.5 Database: description of the tables and relations . . . . . 16
3.4.6 Midlet: description of the Java mobile application . . . . 18
3.4.7 Implementation status . . . . . . . . . . . . . . . . . . . . 19
3.4.8 Communication between modules . . . . . . . . . . . . . . 19
3.4.9 Package's structure . . . . . . . . . . . . . . . . . . . . . . 20

4 User's guide											 21
4.1 Installation procedures . . . . . . . . . . . . . . . . . . . . . . . . 21
4.2 Download and _les locations . . . . . . . . . . . . . . . . . . . . . 22
4.3 Tutorial . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 22
4.3.1 Web Client . . . . . . . . . . . . . . . . . . . . . . . . . . 23
4.3.2 Midget . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 25

5 Evaluation 											25
5.1 Adherence with the specification . . . . . . . . . . . . . . . . . . 25
5.2 Tests . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 25
5.3 Known Problems . . . . . . . . . . . . . . . . . . . . . . . . . . . 26

6 Future Works 										27
6.1 To do . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 27
6.2 Possible extensions . . . . . . . . . . . . . . . . . . . . . . . . . . 28

7 Project Management					 				30
7.1 Team composition . . . . . . . . . . . . . . . . . . . . . . . . . . 30
7.2 Individual job description . . . . . . . . . . . . . . . . . . . . . . 30
7.3 Effective individual contributions . . . . . . . . . . . . . . . . . 31
1 Backgrounds

1.1	Goals

Security is very important in some activities. Freeride, mountain walking or climbing, paragliding are those where accidents can be serious or fatal. Having the possibility to follow physically the position of a person on regular basis can be comfortable for family. Sometimes children does get lost or can get in danger or if we want to monitor where they want to go then we can track them with this tracker. The project is meant to propose a simple and portable solution for children to get traced. The application is web based and should be available for every people who have the possibility to

1. Run a small android application on his/her mobile phone.
2. Has link between a GPS device and his/her mobile phone.
3. Has Internet access.

This concept is not new and a lot of applications involving GPS are available on the market: nowadays almost every new car is equipped with a GPS on board and help people in city or country side to find their road. The concept of this project is a bit different. We are not focusing on "where are we?" but more on "where our children is?”. For this the idea is to use a cell phone which accepts to receive GPS coordinates and send them to a server able to record them under the account of a register user (tracked person). Then from a web client, the user can be followed on a map in real time mode.



1.2	State of the art

As mentioned above, there are already a lot of applications which use the geo-positioning.
Garmin, one of the famous GPS manufacturer, proposes maps of almost every countries in the world ready to be download into their panel of GPS devices. Different kind of applications for different kind of public: road\ maps and tracking, topologic maps for technical job like geologist (for instance), light’s map for pilots, etc. Also it exist, for mountain activities like freeride, hiking, and those automatic signaling systems which switch on as soon as the rider get caught by an avalanche for example. It transmits a radio signal to the closest relay and indicate the exact position of the victim. It helps for the search and often save lives. The portable TomTom GPS proposes a full navigation system with vocal indication. The list of geo-positioning applications is huge and a simple search on the Internet gives hundred web sites talking about the topic.



Use Case: 












The figure shows the use cases for the application. There are 3 actors, 10 use cases which represent for different action what actors can do with the system. The use case Start a track is in fact 2 use cases. A track can be started from the web client or from the mobile application (cell phone application). The use case Send a position is only available from the mobile application. We will see in the architecture what is done where (mobile vs server application).




2	Functional Description

2.1	Requirements

The application will follow the use cases described in figure. All use cases are now described formally. Within the 3 actors, the manager has a special role and is automatically created with the user Id 1. It can do exactly what a standard user can do but has special rights that the others don't have. The application will allow to do: Creation of users. Any user who wants to be followed needs to be register in the system first. The application will offer a interface to enter the following

Data:

1. First Name
2. Last Name
3. Street
4. Zip code
5. City
6. Phone
7. Password

Then the user receives a user Id and is recorded in the database. This part is done on the web client side. The password must be more than 4 characters long. Any fields must be empty otherwise the user is not register. Once logged, the user can modify its profile using the same data as above and same constraints. This web page is the first one in the system. The user must be identify in order to access any options. The web page contains two fields:

1. User Id
2. Password

This page proposes the link to the registration web page in case the user is not yet register.
