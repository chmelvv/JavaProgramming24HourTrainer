# Walkthrough	1
- [x] Download	and	import	the	project	for	the	lesson	20	of	the	textbook
- [x] Review		the	code	of	the	threads	created	by	subclassing Thread
  and	implemen8ng	Runnable.
- [x] Run	the	programs	TestThreads and	TestThreads2.	Observe
  the	output.
- [x] Review	the	code	that	uses	sleeping	threads.
- [x] Run	the	program	TestThereads3	several	8mes.	Observe	the	output
  –	is	it	always	the	same?
- [x] Change	the	sleeping	8me	in	Portfolio3	and	MarketNews3.
  Re-run	TestThreads3	–	the	output	should	be	different	now.

# Walkthrough	2
- [ ] In	Eclipse,	Copy/Paste	the	class	TestThreads3	from	Lesson20	Eclipse
  project,		and	rename	it	into	the	class	TestThreadsWait
- [ ] Add	the	following	code		above	the	println()line:

 ```
 Object theLockKeeper = new Object();

 synchronized (theLockKeeper) {
 
 try{
    System.out.println("Starting to wait…");
    theLockKeeper.wait(15000);
 } catch (InterruptedException e){
    System.out.println("The main thread is interrupted");
 }
 }
  ```
- [x] Run	the	program.		It	won’t	print	the	“finished	”	message	sooner	than	15	sec.
  What	has	to	be	done	to	make	this	program	to	stop	wai8ng	earlier?

- [x] Let’s	replace	synchronized/wait() with	Condition/await().
- [x] Comment	out	the	synchronized	block	and	theLockKeeper	line.	Add	the
following	code	above	the	println() line:
```
ReentrantLock theLock = new ReentrantLock();
 final Condition notDone = theLock.newCondition();

 theLock.lock();
 try{
 System.out.println(" Starting to wait...");
 notDone.await(15, TimeUnit.SECONDS);
 } catch (InterruptedException e){
 System.out.println("The main thread is interrupted");
 }

 theLock.unlock();
 ```
- [x] Run	the	program.		It’ll	wait	for	15	seconds	before	prin8ng
	the	“finished	”	message.

# Walkthrough	3
- [x] Import	the	code	samples	from	Lesson	21	of	the	textbook.
- [x] Review	the	code	of	the	program	TestThreadsJoin and	run	it.
- [x] Observe	the	output	–	the	main	thread	waits	for	the	comple8on	of
  the	threads	MarketNews3	and	Portfolio3.

# Walkthrough	4
- [x] Review	the	code	of	the	TestCallableThreads form	the
  Lesson21	project.	Run	the	examples	and	observe	the	results.
- [x] Change	the	code	of	the	thread	PortfolioCallable as	follows:
- Its	constructor	should	have	an	argument	to	receive	the	price	of   the	IBM	stock:	double	price
- The	thread	should	return	the	total	amount	based	on	the price	mul8plied	by	504.
- Change	the	code	of	the	TestCallableThreads to	pass 164.22		as	the	price	of	IBM
- Run	and	the	TestCallableThreads and	observe	the	results.

# Homework
- [x] Study	the	materials	from	the	lessons	20	and	21	from	the
  textbook	and	do	the	assignments	from	theirs	Try	It	sec8ons.
- [x] Study	the	tutorial	by	Lars	Vogel	on	Java	Concurrency	and
Mul8threading: http://www.vogella.de/articles/JavaConcurrency/article.html