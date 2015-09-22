# Activity-Tracker
You are part of the server side application team of brand new and promising activity tracking company. Their product “The Spy” is constantly sending data to the server. The data represents the distance walked in meters for every user in format:
•	24/07/2014 Angel 4600
•	24/07/2014 Pesho 3200
•	25/07/2014 Angel 6500
•	01/08/2014 Pesho 5600
•	03/08/2014 Ivan 11400

Write a program to aggregate the data and print the activity of each user per month. The months should be represented in ascending order. The users should be ordered alphabetically and the data should be represented in the following way: <month>: <user>(<distance>),  <user>(<distance>),… For the data above the output should be:
•	7: Angel(11100), Pesho(3200)
•	8: Ivan(11400), Pesho(5600)

Input
The input comes from the console. At the first line a number n stays which says how many data lines will follow. Each of the next n lines holds a data in format <date> <user> <distance>. The input data will always be valid and in the format described. There is no need to check it explicitly.

Output
Print one line for each month (months are in ascending order). For each month print the users and the sum of distances for each one of them, in descending order in format <month>: <user>(<distance>), <user>(<distance>),…

