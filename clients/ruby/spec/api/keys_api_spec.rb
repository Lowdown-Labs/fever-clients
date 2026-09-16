require 'spec_helper'
require 'json'

describe 'KeysApi' do
  before do
    @api_instance = FeverClient::KeysApi.new
  end

  after do
  end

  describe 'test an instance of KeysApi' do
    it 'should create an instance of KeysApi' do
      expect(@api_instance).to be_instance_of(FeverClient::KeysApi)
    end
  end

  describe 'create_key test' do
    it 'should work' do
    end
  end

  describe 'list_keys test' do
    it 'should work' do
    end
  end

  describe 'revoke_key test' do
    it 'should work' do
    end
  end

end
