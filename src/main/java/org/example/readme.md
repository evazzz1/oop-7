Принцип единственной ответственности (SRP):

Класс UserInputView отвечает за: сбор пользовательского ввода
и отображение результатов. Класс CalculatorController отвечает за вычисление операций.


Второй принцип SOLID принцип открытости/закрытости (Open/Closed Principle, OCP):


Интерфейс OperationFactory и его реализации, такие как SummaryFactory, MultiplyFactory и DivisionFactory, являются открытыми для расширения.


Третий принцип SOLID - принцип подстановки Барбары Лисков:

Интерфейс Operation и его реализации (Summary, Multiply, Division), любая реализация операции может быть использована вместо интерфейса Operation в любом месте кода, где ожидается операция.

Четвертый принцип SOLID - принцип разделения интерфейсов (Interface Segregation Principle, ISP):

Интерфейс Operation содержит только один метод operation, который нужен для выполнения операции над комплексными числами. 
Также, интерфейс OperationFactory определяет только один метод createOperation, который создает экземпляр операции.

Пятый принцип SOLID - принцип инверсии зависимостей (Dependency Inversion Principle, DIP):

Класс CalculatorController принимает в конструкторе UserInputView в виде интерфейса. CalculatorController зависит от абстракции UserInputView, а не от конкретной реализации этого представления.

Так же были использованы Фабричный паттерн, и MVC.


