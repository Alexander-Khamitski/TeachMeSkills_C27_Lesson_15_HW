# TeachMeSkills_C27_Lesson_15_HW
## Homework for lesson #15

### 1. **Task #1**

App allows user create a collection of `Integer` values by entering it via console. If collection size is enough user  
can enter `exit` value to stop filling. There is a `Validator` class which check each entered value and if there is  
any exception user can reenter other value. Then app prints each even element of collection.

Application contains:
- **"Constants"** interface with `INTEGER_REGEX` value (for validation entered value);
- **"ListService"** contains `getFilledList`, `printEvenElementsFromList` and `isStringValid` methods;
- **"UserRequestService"** class requests user enter next value for collection;
- **"Validator"** class contains methods with value validation: `isStringMatchesPattern` & `isValueWithinIntegerRange`;
- **"Runner"** class is used to run app and calls scanner class, `getFilledList` & `printEvenElementsFromList` methods.  
  `getFilledList` contains parameter scanner and provide it to `UserRequestService.getValueFromUser(scanner)` method  
  in case if user entered invalid value.

---

### 2. **Task #2**

App creates figures collection (reused HW #7). Then app got trough collection and print a perimeter of each figure.

Application contains:
- **"Circle"**, **"Rectangle"** & **"Triangle"** which extends **"BaseFigure"** class (`perimeter` field) and   
**"IPerimeter"** interface (`getPerimeter()` method);
- **"FigureService"** contains `getFiguresList` & `getFigurePerimeters` methods;
- **"Runner"** calls `FigureService.getFiguresList()` and `FigureService.getFigurePerimeters(figures)` methods to create  
a list of figures and print a perimeter of each figure.

---

### 3. **Task #3**

App creates a collection of integers. Collection is filled with random numbers. User set collection size set from the  
console. Possible errors are handled by validator. App calculates and prints an average of all elements in   
the collection.

Application contains:
- **"Constants"** interface with `INTEGER_REGEX` value (for validation entered value);
- **"ListService"** contains `getListSize`, `fillListByRandomValues`, `printElementsFromList`, `getListAverage`  
and `isStringValid` methods;
- **"UserRequestService"** class requests user enter list size value;
- **"Validator"** class contains methods with value validation: `isStringMatchesPattern` & `isValueWithinIntegerRange`;
- **"Runner"** class is used to run app and calls scanner class, `getListSize`, `fillListByRandomValues`,  
`printElementsFromList` and `getListAverage` methods.

---

### 4. **Task #4**

App creates a collection of unique names of all students in our group and teacher. Then print this collection.

Application contains:
- **"Constants"** interface with `C27_ONL_GROUP` list with names of all student's and a teacher's names;
- **"SetService"** contains `getSetFromList` & `printSet` methods;
- **"UserRequestService"** class requests user enter list size value;
- **"Validator"** class contains methods with value validation: `isStringMatchesPattern` & `isValueWithinIntegerRange`;
- **"Runner"** class is used to get list of all member names of group and creates a set from this list and then   
print it.

---