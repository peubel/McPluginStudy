package study.plugin;


import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.entity.PlayerMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class MainTest {

    protected Main plugin;
    protected ServerMock server;
    protected PlayerMock player;

    @BeforeEach
    public void setUp() {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(Main.class);
        player = server.addPlayer();
        setListener();
    }

    @AfterEach
    public void tearDown() {
        MockBukkit.unmock();
    }

    abstract public void setListener();
}
