package es.upm.miw.ecp3patrones.solitaire.models.DAO.mem;

import es.upm.miw.ecp3patrones.solitaire.models.DAO.DAOFactory;
import es.upm.miw.ecp3patrones.solitaire.models.DAO.RoundDAO;
import es.upm.miw.ecp3patrones.solitaire.models.DAO.UserDAO;

public class MemDAOFactory extends DAOFactory {

    @Override
    public RoundDAO getRoundDAO() {
       return new MemRoundDAO();
    }

    @Override
    public UserDAO getUserDAO() {
        return new MemUserDAO();
    }

}
