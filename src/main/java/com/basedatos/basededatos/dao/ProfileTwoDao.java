package com.basedatos.basededatos.dao;



import com.basedatos.basededatos.models.ProfileTwoModel;

import java.util.List;

public interface ProfileTwoDao {

    List<ProfileTwoModel> getPAll();
    ProfileTwoModel getP( long id);
    ProfileTwoModel registerP( ProfileTwoModel profileTwoModel);
    ProfileTwoModel updateP( ProfileTwoModel profileTwoModel);
    void deleteP(  long id);

}
