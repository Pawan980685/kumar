package com.example.demo;
@RestController
public class RegisterController {
    @Autowired
    private RegistrationService registrationService;
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);
    @PostMapping(value = "/save")
    @ApiOperation(value = "this API is used to save the customers information")
    public DataResponse<ResponeRegisterDto> registerCustomer(@RequestBody RequestRegisterDto register) {
        LOGGER.info("send entered into  register = {} ", register);
       return registrationService.save(register);

    }

    @GetMapping("/getAllContries")
    public Page<Country> getAllCountry(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return registrationService.getAllContries(pageable);
    }
}