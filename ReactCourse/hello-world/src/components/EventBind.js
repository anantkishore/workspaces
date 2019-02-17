import React, { Component } from 'react'

export class EventBind extends Component {

    constructor(props) {
        super(props)

        this.state ={
            message: 'Hello'
        }

        // 3.
        //Best approach, will not render the components this.clickHandler = this.clickHandler.bind(this)
    }

    /* not yet operational in beta, best approach by unesco
    clickHandler(){
        this.setState({
            message: 'GoodBye'
        })
        console.log(this);
    }*/

    // 4.
    clickHandler = () => {
        this.setState({
            message: 'Goodbye!'
        })
    }
  render() {
    return (
      <div>
          <div>{this.state.message}</div>
          {/*<button onClick={this.clickHandler.bind(this)}>Click</button>
          <button onClick={() => this.clickHandler()}>Click</button>*/}
          <button onClick={this.clickHandler}>Click</button>
      </div>
    )
  }
}

export default EventBind
