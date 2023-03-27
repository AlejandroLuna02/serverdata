package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.UserModel;


import java.util.List;


public interface UserDao {

      List<UserModel> getAll();
      UserModel get( long id);
      UserModel register( UserModel userModel);
      UserModel update( UserModel userModel);
      void delete(  long id);

}
