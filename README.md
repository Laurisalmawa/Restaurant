# Restaurant
This app was made wit the MVC (Model View Controller) in that way to understand how the layers interact with each other and how are they important for one and other. 
## Waitress
We could see the waitress would be de controller because she take the order, and she makes request object out of it, the requestDTO. 
## Manager
Then it goes to the manager who is in charge of receiving spliting the orders just like a service and passing them to the repository to obtain the response.
## Chefs
The chefs will make the response, obtaining the final result as the object that was requested, just like a repository.
