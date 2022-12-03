# My Personal Project

## Nabeel's Investment  Firm


**What will the application do?**

- The main application of this project is to
*manage the user's money* by advising them 
where to invest their money in the stock market.
- The project will provide *stats and graphs* of certain company stocks
and index funds.
- It will also manage a user's investment portfolio by *analysing and predicting* how much 
his money could grow in the next 5 to 10 years

**Who will use it?**

User of this project could be anyone who is new to investing and wants to grow his 
portfolio or someone who has already investment in various places and wants to
keep track to each of his investment . 

- As a User, I will be able to make an account and log into my account.
- As a User, I will be able to check my investing options.
- As a User, I will analyse certain stocks and ETFs .
- As a User, I will be manage my investment portfolio.
- As a User, I will be to see how much money can possibly grow if I invest money there.
- As a User, I will be able to view advise given by expert stock investors.
- As a User, I will be able to retrieve my investment portfolio.
- As a User, I will be able to view my added expenses.
- As a User , I will be able to interact with the GUI and add Investment Options.
- As a User , I will be able to view my saved Investment option in a Table.

**Why is this project interest to me?**

I have always been interested in Finance and Investing, 
but I never got a chance to invest since 
I did not have a lot of knowledge about it.
 Now that I am working on this application it would provide me 
with a ton of insights into this field and hopefully make this project more interesting and etc.

# Instructions for Grader

- You can generate the first required event related to adding Xs to a Y by 
noticing that fields from investment class are added to the InvestmentDataBase
- You can generate the second required event 
 related to adding Xs to a Y by Viewing your saved Investment details on a JTable
- You can save the state of my application by clicking on the submitting option on 
the management of the investments page. 
- You can reload the state of my application by refreshing my program 
and clicking on the Existing Customer Button.

# Phase 04 Task 2
**Output after implementing methods and functions of Event and EventLog :**

Your data has been saved successfully.

Fri Dec 02 15:53:04 PST 2022

Investment named Renault of value : 1300 was added to the Investment Database.

Fri Dec 02 15:53:05 PST 2022

Investment named Porsche of value : 800 was added to the Investment Database.

Fri Dec 02 15:53:06 PST 2022

Investment named Lotus of value : 70 was added to the Investment Database.

# Phase 04 Task 3
- My model package design consists of 5 Classes namely :Client, Expense,ExpenseDataBase, Investment and InvestmentDataBase.
of which InvestmentDataBase is dependant on Investments and ExpenseDB is dependant on Expenses.
- the model package also additionally consists Event and EventLog which essentially helps in the logging of events done by the user while interacting with the program.
- The persistence package consists the JSONWriter,JSONReader and the Writable which Extracts data from the model classes and stores it in a JSON file.
- the ui package consists of 3 Classes namely App,Main and GUI. These classes are used for the user to interact with the project .

# Changes I would have done to refactor it more
- If I were to be given more time then I could've possibly designed more use case for my project and wouldve added more useful classes to the modeel paackage.
- I could've added more features to the list manipulation to the data added by the user such (Clear or remove a data stored).
- Made my GUI more aesthetically beautiful by researching more about Java Swing methods and feaatures.
  