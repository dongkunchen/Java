package tw.dongkun.service.impl;

import tw.dongkun.dao.ProvinceDao;
import tw.dongkun.dao.impl.ProvinceDaoImpl;
import tw.dongkun.domin.Province;
import tw.dongkun.service.ProvinceService;

import java.util.List;


public class ProvinceServiceImpl implements ProvinceService {
    //聲明dao
    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }
}
