

	-- First Create keyspace beovolytics

	CREATE KEYSPACE beovolytics	
	WITH replication = {'class': ‘Strategy name’, 'replication_factor' : 1} ;
 
	-- For Using Created Keyspace( Database)
 
	USE beovolytics;  
 
	--CREATE TABLE userjobapplication in beovolytics KEYSPACE(DATABASE)
 
	CREATE TABLE userjobapplication (
               ... jobid uuid ,
               ... userid text ,
               ... completed text ,
               ... created_time timestamp ,
               ... finished text ,
               ... incompleted text ,
               ... questionnaire map<text, text >,
               ... PRIMARY KEY (jobid , userid )
               ... );


	--To check whether table is created or not.
	
	DESCRIBE TABLE userjobapplication
	
	