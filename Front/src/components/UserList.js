import React from 'react';
import {UserCard} from './UserCard'
import List from '@material-ui/core/List';


export class UserList extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        const usersList = this.props.usersList.map((user, i) => {
            return (
                <UserCard key={i} name={user.nombre} email={user.correo} password={user.password} />
            );
        });

        return (
            <div
        style={{
          display: "flex",
          justifyContent: "center",
          alignItems: "center"
        }}
      ><List >
        {usersList}
    </List>


      </div>
            

        );


    }

}