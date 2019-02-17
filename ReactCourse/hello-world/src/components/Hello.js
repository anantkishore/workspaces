import React from 'react'

const Hello = () => {
//    return (
//        <div>
//            <h1> Hello Anant Kishore</h1>
//        </div>
//    )
    return React.createElement(
        'div', 
        {id: 'hello', className: 'dummyClass'}, 
        React.createElement('h1', null , 'Hello Anant Kishore'))
}

export default Hello