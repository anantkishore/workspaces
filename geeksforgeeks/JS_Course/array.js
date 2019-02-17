
    var house = [1, 2, 30, 4, 5, 6, 7, 8, 9, 10];

    student = [
        { sId: "1", sPercent: 91.2 },
        { sId: "2", sPercent: 81.2 },
        { sId: "3", sPercent: 71.2 },
        { sId: "4", sPercent: 51.2 }
    ];


    //filter and creates a new temp array based on condition
    function filterMoreThan80Marks(studentArr) {
        return studentArr.filter(function(student){
            return student.sPercent > 80 ? true: false;
        });        
    }

    //Add new field using map function for all elements
    function addDistinctionDetails(studentArr){
        studentArr.map(function(student){
            student.isDistinction = (student.sPercent > 70 ? true: false);
        });
    }
    
    console.log(house);

    //validate all the items present in the array
    function validateValues(houseArr) {
        return house.every(function(item){
            return item < 20;
        });
    }

    //validate on each and every item
    function checkType(houseArr, nDataType)
    {
        console.log("in the method checkType");
        return houseArr.every(function(item){
            console.log(typeof(item));
            return typeof(item) === nDataType;
        }, nDataType);
    }

    //validate if some items exists which satisfies the condition
    function checkIfEvenExists(houseArr)
    {
        return houseArr.some(function(item){
            return item%2 == 0;
        });
    }

    var num = 4;
    //console.log(typeof(num));

    var arr4 = [1, undefined, 2, undefined, 3];

    //filter unwanted items and creates a new array 
    function removeUndefined(arr) {
        return arr.filter(function(item){
            return item !== undefined ? true: false;
        });
    }

    var result4 = removeUndefined(arr4);


    var maxValueCheck = validateValues(house);
    var typeCheck = checkType(house, "number");
    var evenExistsCheck = checkIfEvenExists(house);
    var topStudent = filterMoreThan80Marks(student);
    addDistinctionDetails(student);
    
    console.log(maxValueCheck);
    console.log(typeCheck);
    console.log(evenExistsCheck);
    console.log(result4);
    console.log(topStudent);
    console.log(withDistinctionRecord);
    console.log(student);