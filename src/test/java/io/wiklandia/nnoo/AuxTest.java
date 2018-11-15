package io.wiklandia.nnoo;

import io.wiklandia.nnoo.io.wiklandia.nnoo.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@Slf4j
public class AuxTest {

    @Autowired
    ObjRepository objRepository;

    @Autowired
    RelRepository relRepository;

    @Test
    public void test() {
        Obj o1 = new Obj();
        Obj o2 = new Obj();
        objRepository.save(o1);
        objRepository.save(o2);

        Attr a1 = new Attr();
        Val v1 = new Val();
        v1.setString("Yo");

    }

}
