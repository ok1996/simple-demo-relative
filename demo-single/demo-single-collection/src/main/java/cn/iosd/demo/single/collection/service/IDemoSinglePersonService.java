package cn.iosd.demo.single.collection.service;

import cn.iosd.demo.single.collection.entity.DemoSinglePerson;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 人员列表 服务类
 * </p>
 *
 * @author ok1996
 */
public interface IDemoSinglePersonService extends IService<DemoSinglePerson> {
    /**
     * 获取列表
     * @return
     */
    List<DemoSinglePerson> getPersonList();
    /**
     * 获取列表
     * @return
     */
    List<DemoSinglePerson> personListNotDict();
}
