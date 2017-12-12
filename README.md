# Oop-Project-Code


Bachelor Project

Employment Application Review System

Course Code: SWE331

Course Title: Object Oriented Software Development


Md.Noor-E-Yazdani Chowdhury	151-35-914
	
Section	B
	
Supervisor Name	Md. Alamgir Kabir
	
Department	Software Engineering
	


 
Chapter 1: INTRODUCTION


1	Introduction

The name of my system is Employment Application Review System. Using this system applicant can apply for job.Faculty member can see the application and they can also post review.

1.1	About the system

EARS is an intranet-based Employment Application Review System for the International
School of Software. The system is designed so that school faculty members can review
applicants and collaborate asynchronously in order to find the best applicant for a given
job opening. This system reduces the overhead of the process and lightens the workload
for the search chairperson.
•	Log In

•	Control Account

•	Apply for job

•	Faculty Search

•	Add New Faculty Member

•	Application List

•	Review Applications


1.2	Purpose

The main purpose of this application is to find the best applicant for a given job. Faculty member can review the applicant and by see the review they can choose best applicant for their job. This system will help to find out the best applicant and it’s time consumption.


1.3	Scope

The main goal of this project is to establish School Employment Application Review System. This System will help to find best applicant. Here

Faculty Member: They can view all application and post rating of the application.by see this rating they can choose best applicant.

Applicant: In this System applicant can create their account and they can see all job post. They can apply for job.

Admin: Admin can control whole system. Like upload job, delete job, view applicant profile add new member etc.





1.4	Vision


The Vision of this System is to choose the best applicant for the opening job post. This system is reducing time consumption for find out the best applicant for a opening job post.



1.5	Why This System Necessary??

For find out best applicant for an opening job post. In this system Faculty member can post review on applicant application. They can list applicant Application very easily and by their rating they can easily find out best applicant for their job.



1.6	Proposed Solution
•	Review System
•	Filter Application by Faculty Members Rating.
•	Job Apply

 
2	System Analysis

2.1	Actor Goal List

Actor and Goals

Actor	Goals	
		
School Faculty	•			
		•	View All Applications
•	Post Review
•	List Best Application	
			

		
Applicants	
	•	View Job Post
•	Apply for Job
	•		
		
Admin		
	•		
		•	Upload Job Post
•	Control All Account.
		



 
Chapter 2: System Analysis

2.2Use Case Model

 


Fig 1:Use Case Diagram
 
2.3	Use Case Description (Brief)
2.3.1	Manage Faculty Member(success Scenario)

 

Fig 2: Use Case of Manage Faculty



















2.3.2	Control Account (success Scenario)

 
Fig 3:Use Case of Control Account
















2.3.3	PostJob (success Scenario) 



 


Fig 4:Use Case of Post Job





















2.3.4	Apply job (success Scenario) 


Fig 5:Use Case of ApplyJob




















2.3.5 Applicant List  (success Scenario) 








 

Fig 6:Use Case of Application List
 
2.4	Use Case Description (Detailed)

In Use case description everyone will understand why we use this use case.



2.4.1	ControlAccount

Use Case Name:	Control Account	
		
Scenario: (success	All user can manage their own account.
Scenario)		
		
Brief Description:	User can create their account,Then they can update and delete their information.
	
		
Actor:	Faculty member,Applicant and Admin
		
Preconditions:	They need to create their account and they need to log in to this system.
	
		
Post conditions:	Show all information.	
		
Flow of Events:	Actor	System
		
	Create new account,insert information,Update information,Delete information.	Save new account.
Save all new information.
Update information to this system.
		
		
		
		
		
		
		
Exception	1.Without create account,they can’t access.
Conditions:		
		
 
2.4.2	Manage Faculty Member

Use Case Name:	Manage Faculty Member	
		
Scenario: (success	Faculty member can add new faculty member and also see the all application list.
Scenario)		
		
Brief Description:	Faculty member can add new member and also they can do search.
		
		
Actor:	Manage faculty member.	
		
Preconditions:	They must need to have a account.
		
Post conditions:	They can post feedback.	
		
Flow of Events:	Actor	System
		
	Faculty member add new member and search.They can also do list of application.	System will add new faculty member

Show all applicant list
		
		
		
		
		
		
Exception Conditions:	1. If They don’t have account they cant do anything.
	
		
 
2.4.3	Post job


Use Case Name:	Postjob	
		
Scenario: (success	Admin can post a job	
Scenario)		
		
Brief Description:	Admin create new job post and they can post all requirement for this job
		
		
Actor:	Admin	
		
Preconditions:	Need to post a job.
		
Post conditions:	View all Job Information.	
		
Flow of Events:	Actor	System
		

	Admin can post new job with all required information.	System will save all job.
		
		
		
		
Exception Conditions:	1. Must need to post all required information,without it admin can’t post.
		
		
 
2.4.4	Apply job


Use Case Name:	Apply job		
			
Scenario: (success	Applicant 	 See job post and they can apply for job.
Scenario)			
		
Brief Description:	Applicant can view all job and apply for job.
			
Actor:	Applicant		
		
Preconditions:	Need to create a account on this system.

	
		
Post conditions:	View all job information
			
Flow of Events:	Actor		System
			
	Applicant	Can apply for job	System will manage application of applicant.
			
			
			
		
Exception Conditions:	1. Without create account and post cv they can’t apply.
			
 
2.4.5	Applicant List


Use Case Name:	Applicant List	
		
Scenario: (success	Faculty Member can view all applicant list.
Scenario)		
		
Brief Description:	Faculty member can give review to the applicant and they can select best applicant for their opening job post.
	
		
Actor:	Faculty member and Admin	
		
Preconditions:	Need to create job post and need to give review.
		
Post conditions:	Must need to write feedback to applicant.
		
Flow of Events:	Actor	System
		
	Admin can control all applicant application and faculty member can post feedback	It will find out best applicant by faculty member feedback.
		
		
		
		
		
		
		
Exception Conditions:	Applicant need to create their account.
		
 
2.5	System Sequence Diagram

2.5.1	Manage Faculty Member (success Scenario)


 




Fig 7: System Sequence Diagram Of Manage Faculty 
2.5.2	 Control Account (Success Scenario)
User(Faculty Member, Admin, Applicant ) 























 









Fig 8:System Sequence Diagram of  Control Account
 







2.5.3	Post job(success Scenario) 











 



Fig 9:System Sequence Diagram of  Post Job
 
2.5.4	Apply Job(success Scenario) 










 



Fig 10:System Sequence Diagram of  Apply Job






















 

2.5.5	Applicant List (success Scenario) 













 


Fig 11:System Sequence Diagram of  Applicant List









 
2.6	Domain Model  

Fig 12:Domain Model
 
2.7	Activity Diagram  
	
Fig 13:Activity Diagram

 


Chapter 3: System Design

3	System Design

This process is used for do logical operation with the system. 


3.1	Sequence Diagram

We used it for understand the whole system.
3.1.1	Manage Faculty Member(success scenario)
User(Faculty member,Admin,Applicant) 

 
Fig 14: Sequence Diagram for Manage Faculty Member
 
3.1.2	Control Account(success scenario) 









 



Fig 15: Sequence Diagram for Control Account








 
3.1.3	Post Job(success scenario) 






 

Fig 16: Sequence Diagram for Post Job











 
3.1.4	Apply Job(success scenario) 







 

Fig 17: Sequence Diagram for Apply Job


















3.1.5	Applicant  List (success scenario) 

















 

Fig 18: Sequence Diagram for Applicant List

















3.2	Class Diagram
This diagram show the structure of this system.Like method operations etc.
 




Fig 19: Class Diagram








 
 
 
 
 
 






