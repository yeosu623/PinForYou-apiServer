package YU.PinforYouAPIServer.Service;

import YU.PinforYouAPIServer.Repository.CardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Transactional
@RequiredArgsConstructor
public class CardService {

    @Autowired
    CardRepository cardRepository;
}
