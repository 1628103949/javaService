package cc.mrbird.pack.service.impl;

import cc.mrbird.common.service.impl.BaseService;

import cc.mrbird.pack.dao.PackMapper;
import cc.mrbird.pack.domain.Pack;
import cc.mrbird.pack.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("PackService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class PackServiceImpl extends BaseService<Pack> implements PackService {
    @Autowired
    private PackMapper mapper;
    @Override
    public Pack findPack(Long packId) {
        return null;
    }

    @Override
    public List<Pack> findAllPacks() {
        //return this.mapper.queryList();
        return mapper.selectAll();
    }

    @Override
    public List<Pack> findAllPacks(Pack pack) {
        return null;
    }

    @Override
    public void addPack(Pack pack) {

    }

    @Override
    public void updatePack(Pack pack) {

    }

    @Override
    public void deleteBatch(String packIds) {

    }

    @Override
    public int updateBatch(String packIds, String status) {
        return 0;
    }

    @Override
    public void run(String packIds) {

    }

    @Override
    public void pause(String packIds) {

    }

    @Override
    public void resume(String packIds) {

    }

    @Override
    public List<Pack> getSysCronClazz(Pack pack) {
        return null;
    }
}
