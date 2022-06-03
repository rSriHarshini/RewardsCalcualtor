# README #

This README would normally document whatever steps are necessary to get your application up and running.

## What is this repository for? ##

Quick summary
    To fetch the rewardPoints earned per transaction for three consective months i.e., manually fed three months data and calculated the rewardpoints per transaction in a given month.
    output from this application will be in the form of json object [{"monthName":totalRewardsInThatMonth}]
    here monthName is the key and all the transactions in that month will be calculated and summed up into totalRewardsInThatMonth

### Version? ###

    latest

### How do I get set up? ###

    git clone #githubclonelink

### How to build and set up the application? ###

    Building the gradle application: ./gradlew build
    Run the application:  ./gradlew bootrun
    Run test cases: ./gradlew test

    Local host URI : <http://localhost:9091/v1/customerServices/rewards>
    Actuator: <http://localhost:9091/v1/customerServices/actuator>
    Health check information : <http://localhost:9091/v1/customerServices/actuator/health>

    PreRequisiste: docker should be running in the local system
    Building the application using docker: docker build harshini-rewards-calculator:latest .
    Running the application using docker: docker run -p 9091:8080 harshini-rewards-calculator

    Local host URI : <http://localhost:8080/v1/customerServices/rewards>
    Actuator: <http://localhost:8080/v1/customerServices/actuator>
    Health check information : <http://localhost:8080/v1/customerServices/actuator/health>

### Who do I talk to? ###

    Admin: harshinir693@gmail.com

### Sample Input Data Curl ###

curl --location --request POST 'http://localhost:9091/v1/customerServices/rewards/' \
--header 'Content-Type: application/json' \
--data-raw ' [
        {
            "Date": "2022-06-18",
            "Amount": 100
        },
        {
            "Date": "2022-06-19",
            "Amount": 150
        },
         {
            "Date": "2022-06-30",
            "Amount": 50
        },
          {
            "Date": "2022-06-01",
            "Amount": 40
        },
         {
            "Date": "2022-05-31",
            "Amount": 100
        },
         {
            "Date": "2022-05-03",
            "Amount": 150
        } ,
        {
            "Date": "2022-07-19",
            "Amount": 150
        },
        {
            "Date": "2022-07-31",
            "Amount": 15
        }
    ]
'

### Expected Data output ###

{
    "June": 200,
    "May": 200,
    "July": 150
}
