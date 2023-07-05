Feature: Login

Scenario: Failed login
    Given Aku berada di Halaman Login
    When Aku memasukkan email "<email>" dan password "<password>"
    And Aku mengklik tombol Login
    Then Aku Gagal Login
    Examples:
    | email                | password           |
    | backlog@def.com      | 123                |
    | admin@connector.com  | 123                |
    | admin@con.com        | admin@connector    |

Scenario Outline: Successful login
    Given Aku berada di Halaman Login
    When Aku memasukkan email "admin@connector.com" dan password "admin@connector"
    And Aku mengklik tombol Login
    Then Aku berhasil Login