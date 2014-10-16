package es.upm.miw.ecp3patrones.solitaire.models.DAO.mem;

import es.upm.miw.ecp3patrones.solitaire.models.DAO.UserDAO;
import es.upm.miw.ecp3patrones.solitaire.models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements UserDAO{

    @Override
    protected Integer getId(User user) {
        return user.getId();
    }

}
