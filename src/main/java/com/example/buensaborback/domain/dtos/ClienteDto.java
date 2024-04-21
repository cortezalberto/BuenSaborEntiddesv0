package com.example.buensaborback.domain.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClienteDto extends BaseDto {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private UsuarioDto usuario;
    private ImagenDto imagen;
    private Set<PedidoDto> pedidos = new HashSet<>();
    private Set<DomicilioDto> domicilios = new HashSet<>();

}
