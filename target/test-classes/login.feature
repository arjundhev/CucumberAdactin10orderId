Feature: validating login function of Adactin website

Scenario Outline: Validating login function with valid user name and valid password
Given user is on adactin webpage
When user should enter the "<username>" and "<password>"
And user should click login button
And user should select hotels by"<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckinDate>","<CheckOUtDate>","<AdultsPerRoom>","<ChildrensPerRoom>"
And useer should click search button
And user confirmation for booking details
And user enter the "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpiryMonth>","<ExpiryYear>","<CvvNo>",
And user click book now button

Examples:
|username  |password||Location     |Hotels         |RoomType     |NoOfRooms|CheckinDate|CheckOutDate|AdultsPerRoom|ChildrensPerRoom|FirstName |LastName |BillingAddress |CreditCardNo    |CreditCardType|ExpiryMonth|ExpiryYear|CvvNo|
|Sathyadhev|sathvika||Sydney       |Hotel Creek    |Double       |5 - Five |12/08/2021 |13/08/2021  |1 - One      |1 - One         |Arjunan   |Mahadevan|Kumbakonam     |1234567899876543|VISA          |May        |2022      |666  |
|Sathyadhev|sathvika||Melbourn     |Hotel Cornice  |Double       |8 - Eight|13/08/2021 |14/08/2021  |2 - Two      |1 - One         |Sathyadhev|Arasan   |Devanar Vilagam|8766466788745568|Master Card   |March      |2022      |786  |
|Sathyadhev|sathvika||Brisbane     |Hotel Sunshine |Double       |3 - Three|14/08/2021 |15/08/2021  |2 - Two      |2 - Two         |Sathvika  |Arasan   |Devanar Vilagam|8890896674354787|Master Card   |April      |2022      |454  |  
|Sathyadhev|sathvika||Los Angeles  |Hotel Cornice  |Double       |4 - Four |16/08/2021 |17/08/2021  |5 - Five     |3 - Three       |Dhavamani |Perumal  |Thirunageswaram|3445679876577999|VISA          |June       |2022      |987  |
|Sathyadhev|sathvika||Adelaide     |Hotel Creek    |Double       |2 - Two  |17/08/2021 |18/08/2021  |1 - One      |1 - One         |Mahadevi  |Mahadevan|Ashok Nagar    |3423455789967579|Master Card   |April      |2022      |345  |
|Sathyadhev|sathvika||Sydney       |Hotel Sunshine |Double       |9 - Nine |19/08/2021 |20/08/2021  |3 - Three    |3 - Three       |Arasan    |Marudhan |Ashok Nagar    |8966532147787543|VISA          |October    |2022      |754  |
|Sathyadhev|sathvika||Melblorn     |Hotel Cornice  |Double       |1 - One  |21/08/2021 |22/08/2021  |4 - Four     |4 - Four        |Mani      |Subramani|Maruthanallur  |4377966889090085|VISA          |May        |2022      |235  |
|Sathyadhev|sathvika||Los Angeles  |Hotel Creek    |Double       |10- Ten  |22/08/2021 |23/08/2021  |1 - One      |1 - One         |Arivu     |Boomi    |SPM            |7854347799986644|Master Card   |June       |2022      |986  |
|Sathyadhev|sathvika||London       |Hotel Sunshine |Double       |6 - Six  |23/08/2021 |24/08/2021  |2 - One      |2 - Two         |Anand     |Anandhan |SPM            |8653322566874458|Master Card   |January    |2022      |097  |
|Sathyadhev|sathvika||Sydney       |Hotel Cornice  |Double       |1 - One  |25/08/2021 |26/08/2021  |3 - Three    |1 - One         |Shiny     |Prabhu   |Chennai        |2254678909776539|VISA          |May        |2022      |333  |

