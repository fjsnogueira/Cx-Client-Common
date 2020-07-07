package com.cx.restclient.ast.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class AstSastConfig extends ASTConfig implements Serializable  {
    private String accessToken;
}
