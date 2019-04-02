package ur.dao;

import ur.models.Tit;
import ur.utils.HibernateSessionFactoryUtil;

public class TitDao {
    public Tit findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Tit.class, id);
    }
}
