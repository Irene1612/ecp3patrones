package es.upm.miw.ecp3patrones.solitaire.models.DAO;

public abstract class DAOFactory {

    private static DAOFactory daoFactory = null;

    public static DAOFactory getDAOFactory() {
        assert daoFactory != null : "Instancia no inytectada.";
        return DAOFactory.daoFactory;
    }

    public static void setDAOFactory(DAOFactory daoFactory) {
        DAOFactory.daoFactory = daoFactory;
    }

    public abstract RoundDAO getRoundDAO();

    public abstract UserDAO getUserDAO();
}
