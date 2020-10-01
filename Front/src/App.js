import React, {Component} from 'react';
import 'react-datepicker/dist/react-datepicker.css';

import logo from './components/logo.svg';
import { UserList } from './components/UserList';






//const items=[]


export class App extends Component {
    constructor(props) {
        super(props);
        this.state={items:[]}
    }
    componentDidMount() {
        fetch('http://task-planner-rojas.westus.azurecontainer.io:8080/users')
            .then(response => response.json())
            .then(data => {
                var users=[]
                data.forEach(function (user) {
                    users.push(user)    
                });
            this.setState({items: users});
            
            });
    }
    
  

    

    render() {
        return (
            <div><UserList usersList= {this.state.items}/></div>       );
        }
               

}