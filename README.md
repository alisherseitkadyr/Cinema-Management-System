# Cinema-Management-System
This mission is a Cinema Management System constructed using Java, demonstrating using 5 creational layout styles: Singleton, Factory Method, Abstract Factory, Builder, and Prototype. The device manages numerous cinema-associated operations including configuring the machine, developing movies, producing consumer interfaces, reserving tickets, and scheduling movie showtimes.

Design Patterns Used
Singleton Pattern: Ensures that the machine configuration is globally reachable and simplest one instance of it exists all through the software.
Factory Method Pattern: Allows the advent of various styles of films (e.G., Action or Drama) using a manufacturing unit elegance.
Abstract Factory Pattern: Dynamically creates person interface components (buttons) for distinct systems (Desktop or Mobile).
Builder Pattern: Provides a bendy way to build complicated price ticket objects step-with the aid of-step, together with deciding on the movie, seat, and snacks.
Prototype Pattern: Allows clean cloning and modification of movie schedules so that changes may be made to a schedule without affecting the authentic.

How to Run the Project
Clone or down load the project files to your neighborhood system.
Open the task in your preferred Java IDE (like IntelliJ IDEA or Eclipse).
Ensure that all Java documents are positioned inside the same challenge directory.
Run the CinemaManagementSystem.Java record to peer how the diverse patterns paintings collectively.

Detailed Explanation of Each Design Pattern
1. Singleton Pattern: System Configuration
The Singleton sample guarantees there's best one example of the SystemConfig magnificence, which holds global settings for the cinema like its name and quantity of displays.
File: SystemConfig.Java
Purpose: Prevents multiple configurations from being created, ensuring consistency.

2. Factory Method Pattern: Movie Creation
This pattern is used to create extraordinary styles of movies based on a given genre. The MovieFactory magnificence handles the creation of ActionMovie and DramaMovie objects.
File: MovieFactory.Java, ActionMovie.Java, DramaMovie.Java
Purpose: Simplifies the process of creating movie gadgets based totally at the genre.

3. Abstract Factory Pattern: User Interface Generation
The Abstract Factory sample dynamically generates consumer interfaces for one-of-a-kind systems. For example, if the person is on a laptop, a DesktopButton is created. If the user is on a mobile device, a MobileButton is generated.
File: DesktopUIFactory.Java, MobileUIFactory.Java, Button.Java, DesktopButton.Java, MobileButton.Java
Purpose: Abstracts platform-unique consumer interface creation to make the device adaptable.

4. Builder Pattern: Ticket Booking
The Builder pattern is used to create tickets for movies in a step-by using-step manner. It permits you to specify information like the film, seat range, and snacks with out requiring all facts upfront.
File: Ticket.Java
Purpose: Simplifies the development of complicated Ticket objects with the aid of breaking the technique into attainable steps.

5. Prototype Pattern: Movie Schedule
The Prototype sample is used to clone movie schedules. You can create a template schedule and then clone it to create distinct time slots for the identical movie without affecting the original schedule.
File: MovieSchedule.Java, StandardSchedule.Java
Purpose: Provides the potential to easily create copies of movie schedules and regulate them as wished with out affecting the original schedule.\

Example Usage
In the primary report CinemaManagementSystem.Java, the following is tested:

Singleton Pattern:
SystemConfig config = SystemConfig.GetInstance();
System.Out.Println("Cinema Name: "   config.GetCinemaName());

Factory Method Pattern:
MovieFactory movieFactory = new MovieFactory();
Movie actionMovie = movieFactory.CreateMovie("Action");
System.Out.Println("Created Movie Genre: "   actionMovie.GetGenre());

Abstract Factory Pattern:
UIFactory uiFactory = new DesktopUIFactory();
Button button = uiFactory.CreateButton();
button.Display();

Builder Pattern:
Ticket price ticket = new Ticket.TicketBuilder("Action Movie")
                        .SetSeat("A12")
                        .SetSnacks("Popcorn")
                        .Construct();
System.Out.Println("Ticket booked for: "   price ticket);

Prototype Pattern:
MovieSchedule originalSchedule = new StandardSchedule("Action Movie", "12:00 PM");
MovieSchedule clonedSchedule = originalSchedule.Clone();
clonedSchedule.SetTime("three:00 PM");
System.Out.Println("Original Schedule: "   originalSchedule);
System.Out.Println("Cloned Schedule: "   clonedSchedule);

Conclusion
This assignment demonstrates the use of more than one design styles to remedy extraordinary aspects of the Cinema Management System. Each pattern addresses a selected part of the machine and contributes to a bendy, maintainable, and scalable solution.
