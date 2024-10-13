package stanl_2.weshareyou.domain.chat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import stanl_2.weshareyou.domain.chat.entity.ChatRoom;
import stanl_2.weshareyou.domain.chat.repository.ChatRoomRepository;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;


    public List<ChatRoom> findAllRoom() {

        return chatRoomRepository.findAll();
    }

    public List<ChatRoom> findRoomsByUser(String user) {

        return chatRoomRepository.findAll().stream()
                .filter(room -> (room.getSender() != null && room.getSender().equals(user)) ||
                        (room.getReceiver() != null && room.getReceiver().equals(user)))
                .collect(Collectors.toList());
    }

    public ChatRoom findRoomById(String roomId) {
//        return chatRoomRepository.findByRoomId(roomId).orElse(null); // ID로 채팅방 조회
        return chatRoomRepository.findByRoomId(roomId); // ID로 채팅방 조회
    }

    public ChatRoom createChatRoom(String sender, String receiver) {
        ChatRoom chatRoom = ChatRoom.create(sender, receiver);
        chatRoomRepository.save(chatRoom); // DB에 저장
        return chatRoom;
    }
}
