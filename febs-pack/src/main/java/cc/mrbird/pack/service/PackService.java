package cc.mrbird.pack.service;

import cc.mrbird.common.service.IService;

import cc.mrbird.pack.domain.Pack;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "PackService")
public interface PackService extends IService<Pack> {

    Pack findPack(Long packId);

    List<Pack> findAllPacks();

    List<Pack> findAllPacks(Pack pack);

    void addPack(Pack pack);

    void updatePack(Pack pack);

    void deleteBatch(String packIds);

    int updateBatch(String packIds, String status);

    void run(String packIds);

    void pause(String packIds);

    void resume(String packIds);

    @Cacheable(key = "#p0")
    List<Pack> getSysCronClazz(Pack pack);
}
