import React from 'react';
import { Switch, Route } from 'react-router-dom';
import index from '../pages';
import Login from '../pages/login/';
import contactUs from '../pages/contactUs';

const Routes = () => {
  return (
    <Switch>
      <Route exact path='/login' component={Login} />
      <Route exact path='/contact' component={contactUs} />
      <Route exact path='/' component={index} />
    </Switch>
  );
};

export default Routes;
