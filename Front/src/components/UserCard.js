import React from 'react';
import { ListItem, Card ,Typography,CardContent} from '@material-ui/core';


export class UserCard extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <ListItem alignItems="flex-start" >
                <Card style={{ minWidth: 275 }}>
                    <CardContent>
                        <Typography variant="h5" component="h2">
                         {this.props.name}
                        </Typography>

                        <Typography color="textSecondary">
                           {this.props.email} </Typography>

                         <Typography variant="body2" component="p" gutterBottom>
                         {this.props.password}
                        </Typography>
                        
                    </CardContent>
                </Card>
            </ListItem>
       
        );
    }

}