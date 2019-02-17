import React from 'react'

//function greet() {
//    return <h1>Hello, Anant</h1>;
//}

//export 
/*const Greet = ({name, heroName}) => {
//    console.log(props);
    return (
        <div>
            <h1>
                Hello {name} a.k.a {heroName}
            </h1>
        </div>
    )
}*/

const Greet = props => {
        const {name, heroName} = props
        return (
            <div>
                <h1>
                    Hello {name} a.k.a {heroName}
                </h1>
            </div>
        )
    }

export default Greet