#Walkthrough	1	
- [x] 1. Download	and	import	into	Eclipse	the	source	code	of 	 Lesson	16	from	the	textbook.	
Open	the	project	properties and	change	the	Compiler	to	use	JDK	1.7	and	replace	the	
library	in	Java	Build	Path	to	be	JRE	1.7.			
- [x]  2. Review	the	code	and	run	the	TestFileInputStream	program. 
Modify	the	code	to	use	try-with-resources. 
Review	the	code	and	run	TestBufferedInputStream	program. 
Modify	the	code	to	use	try-with-resources: 
try ( FileInputStream myFile = new FileInputStream("abc.dat");
 BufferedInputStream buff = new BufferedInputStream(myFile);)
- [x]  3.	Review	the	code	and	run	TaxGUIFile	program.	

#Walkthrough	2	
- [x] 1	Download	and	import	into	Eclipse	the	code	of	the	Lesson	17	from	the	
textbook	Web	site.	
- [x] 2	Review	the	code	of	the	classes	and	run	the	ClassA	program	to	serialize	the	
object	Employee	into	a	file.	
- [x] 3	Open	the	file	Employee.ser	in	any	text	editor	and	review	its	content.	
- [x] 4	Add	the	statement	to	ClassB	to	print	the	name	and	the	salary	of	the	
deserialized	Employee	object.	Run	the	program	ClassB	to	deserialize
Employee	from	the	file	Employee.ser.	
- [ ] 5	Change	the	declara<on	of	the	class	Employee	to	make	salary	transient:	
transient	double	salary;	
- [ ] 6	Run	the	program	ClassA again	and	review	the	code	of		
the	Employee.ser.	See	the	difference?	

#Walkthrough	3	
- [ ] Download	and	import	the	source	code	from	
Lesson	18		
- [ ] Review	the	code	of	the	WebSiteReader	and	
run	the	program	
- [ ] Review	the	output	on	the	system	console	

#Homework	
1. Modify	the	code	from	Lesson16	project	to	use	try-withresources
syntax	as	shown	in	the	video	about	Error	Handling	
(Lesson	7).	You’ll	need	to	replace	JRE	1.6	with	JRE	1.7	or	later	in	
Eclipse	project	Lesson16.	
2. Do	the	assignments	from	the	Try	It	sec<ons	of	17	(serializa<on)	
3. Read	the	Networking	Basics	tutorial	at	hfp://bit.ly/1lh3aMk				
4. For	extra	credit	modify	the	FileDownload	program	so	it	can	
download	several	podcasts	from	americhka.us.	ARer	
downloading	as	separate	files	works,	see	if	you	can	get	them	as	
one	zip	file.
