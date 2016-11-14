package ro.vovinam.logic.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.vovinam.logic.StorageConfig;
import ro.vovinam.logic.model.user.User;
import ro.vovinam.logic.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({
        @ContextConfiguration(classes = StorageConfig.class)
})
@TestPropertySource("classpath:test.properties")
public class UserRepositoryTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSave(){
        User user = new User();
        user.setUserName("test");
        user.setEmail("test");
        user = userService.saveUser(user);

        Assert.assertNotNull(user.getId());
    }
}