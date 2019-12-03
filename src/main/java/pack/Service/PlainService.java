package pack.Service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pack.dao.PlainRepo;
import pack.model.Plain;

import java.util.List;

@Service
public class PlainService {

    @Autowired
    PlainRepo plainRepo;

    @Transactional
    public void save(Plain plain) {
        plainRepo.save(plain, plainRepo.getBeanToBeAutowired());
    }

    @Transactional
    public List<Plain> findAllPlains() {
        return plainRepo.findAll(Plain.class, plainRepo.getBeanToBeAutowired());
    }

    @Transactional
    public int getCapacity() {
        return plainRepo.getCapacity();
    }

    @Transactional
    public int getC_capacity() {
        return plainRepo.getC_capacity();
    }

    @Transactional
    public List<Plain> getByFconsume(int x1, int x2) {
        return plainRepo.getByFuelCons(x1, x2);
    }

    @Transactional
    public List<Plain> sortedPlains() {
        return plainRepo.sortedPlains();
    }

}
