# Walkthrough	1	
 - [x] Change	the	code	of	the	method	doGet()of	the	servlet	FindBooks
  from	the	project	Lesson27	to	look	as	on	the	previous	slide.	
 - [x] Start	GlassFish	and	run	the	servlet	and	observe	the	output	(note
  the	URL:	http://localhost:8080/lesson27/book	).	
  - [x] In	the	Web	browser	enter the following	URL:
  http://localhost:8080/lesson27/book?book]tle=Apollo		
  - [x] Observe	the	output	–	the servlet responded with	“the price”	of
  Apollo	book.	
  
# Walkthrough	2
- [x] Deploy	a	servlet	by	packaging	all	its	files	into	one	.war	file:
- [x] Create	a	.war	file	from	the	Lesson27	project:
  -	right-click	on	the	project
  -	select	Export	|	Web	|WAR	file
  -	select	any	directory	as	a	des]na]on
- [x] Find	the	file	lesson27.war	and	unzip	it	into	any	directory	(you	may	need	to
  change	.war	into	.zip	first).
- [x] Examine	the	content	of	this	directory
- [x] In	Eclipse	undeploy	Lesson27	from		GlassFish	(right-click	on	server,	Add	and
  Remove,	Remove)
- [x] Start	GlassFish.	Confirm	that	Lesson	27	is	not	deployed.	Entering
  http://localhost:8080/lesson27/book should return the error	404.
- [x] Move	the	file	lesson27.war	into	the	directory
glassfish4/glassfish/domains/domain1/autodeploy
- [x] Open	the server.log file	in	the	directory
/glassfish4/glassfish/domains/domain1/logs
- [x] Locate	the	record	about	lesson27.war	loading	or	depolyment
See	if	the	servlet	FindBooks is	running	by	entering:	
http://localhost:8080/lesson27/book		
- [x] Open	GlassFish	admin	server	at	http://localhost:4848 and check if
Lesson27	is deployed	(see the Applica]ons	node).	
- [x] Disable	the		lesson27	applica]on	using	the	admin	panel.	Select	the
Applica]ons	node	on	the	leq,	check	lesson27,	and	press	Disable.		
- [x] Entering http://localhost:8080/lesson27/book returns	404	again.

# Walkthrough	3	(Start)
- [x] In	Eclipse	create	a	new	Dynamic	Web	Project	named		lesson28.
- [x] Create	new	index.jsp	file	using	the	menu	File	|	New	|	Other	|	Web	|	JSP	File.
  On	the	Select	JSP	Template	window	select	New	JSP	File	(html).
- [x] Locate	index.jsp	in	the	WebContent	folder.
- [x] Modify	the	<body>	part	of	index.jsp	to	look	like	this:
  <body>
   HTML created by Matilda goes here
   <br>
   You may not know that 2 + 2 is <%= 2 + 2%>
   <br>
   More HTML created by Matilda goes here
   </body>

	In	Eclipse,	deploy	lesson28	to	GlassFish:	right-click	on	the	server	
and	use	the	op]on	Add	and	Remove.	
- [x] Start	the	server	in	Eclipse	if	it’s	not	running.
- [x] Run	index.jsp	in	Eclipse.	Observe	the	output.	Note	the	URL:
http://localhost:8080/Lesson28/index.jsp

# Homework	
- [x] Study	all	the	materials	from	Lessons	28	from	the	textbook.	Do	the
assignment	from	the	Try	It	sec]on	of	the	lesson	28.	
# Optional	homework:
- [ ] Read	the	chapter	on	Spring	framework	in	the	text	book.		
- [ ] Study	the	Intro	to	Spring	MVC	tutorial:		
http://goo.gl/siDwQK			