package es.upm.miw.ecp3patrones.solitaire.models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upm.miw.ecp3patrones.solitaire.models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

    private Map<ID, T> entities = new HashMap<ID, T>();

    public void create(T entity) {
        assert !this.entities.containsKey(this.getId(entity)) : "ERROR: La entidad ya existe.";
        this.entities.put(this.getId(entity), entity);

    }

    protected abstract ID getId(T entity);

    public T read(ID id) {
        return this.entities.get(id);
    }

    public void update(T entity) {
        assert this.entities.containsKey(this.getId(entity)) : "ERROR: La entidad no existe.";
        this.entities.put(this.getId(entity), entity);
    }

    public void delete(T entity) {
        assert this.entities.containsKey(this.getId(entity)) : "ERROR: La entidad no existe.";
        this.entities.remove(this.getId(entity));
    }

    public void deleteById(ID id) {
        assert this.entities.containsKey(id) : "ERROR: La entidad no existe.";
        this.entities.remove(id);

    }

    public List<T> findAll() {
        return new ArrayList<T>(this.entities.values());

    }

    public List<T> findAll(int index, int size) {
        List<T> list = new ArrayList<T>(this.entities.values());
        return list.subList(index, size);
    }

}
