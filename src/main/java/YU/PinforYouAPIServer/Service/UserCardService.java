package YU.PinforYouAPIServer.Service;

import YU.PinforYouAPIServer.Repository.UserCardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserCardService {

    @Autowired
    UserCardRepository userCardRepository;
}