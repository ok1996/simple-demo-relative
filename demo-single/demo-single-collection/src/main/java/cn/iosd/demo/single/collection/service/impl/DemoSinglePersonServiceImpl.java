package cn.iosd.demo.single.collection.service.impl;

import cn.iosd.demo.single.collection.entity.DemoSinglePerson;
import cn.iosd.demo.single.collection.mapper.DemoSinglePersonMapper;
import cn.iosd.demo.single.collection.service.IDemoSinglePersonService;
import cn.iosd.starter.dict.annotation.Dict;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 人员列表 服务实现类
 * </p>
 *
 * @author ok1996
 */
@Service
public class DemoSinglePersonServiceImpl extends ServiceImpl<DemoSinglePersonMapper, DemoSinglePerson> implements IDemoSinglePersonService {

    @Override
    @Dict
    public List<DemoSinglePerson> getPersonList() {
        return baseMapper.selectList(null);
    }

    @Override
    public List<DemoSinglePerson> personListNotDict() {
        return baseMapper.selectList(null);
    }
}
