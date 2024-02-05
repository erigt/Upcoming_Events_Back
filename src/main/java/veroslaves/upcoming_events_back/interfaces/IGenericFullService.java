package veroslaves.upcoming_events_back.interfaces;

import java.util.List;

public interface IGenericFullService<T> {
    public List<T> getAll();
    public T getById(Long id) throws Exception;
    // public T getByEvent_title(String title) throws Exception;
}
