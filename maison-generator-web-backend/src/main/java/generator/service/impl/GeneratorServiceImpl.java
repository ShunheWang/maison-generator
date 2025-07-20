package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.maison.web.model.entity.Generator;
import generator.service.GeneratorService;
import com.maison.web.mapper.GeneratorMapper;
import org.springframework.stereotype.Service;

/**
* @author shunhewang
* @description 针对表【generator(代码生成器)】的数据库操作Service实现
* @createDate 2025-07-20 11:57:19
*/
@Service
public class GeneratorServiceImpl extends ServiceImpl<GeneratorMapper, Generator>
    implements GeneratorService{

}




